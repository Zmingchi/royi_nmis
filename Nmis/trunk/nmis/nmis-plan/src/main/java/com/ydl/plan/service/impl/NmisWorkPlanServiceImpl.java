package com.ydl.plan.service.impl;

import java.util.List;

import com.ydl.common.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.plan.mapper.NmisWorkPlanMapper;
import com.ydl.plan.domain.NmisWorkPlan;
import com.ydl.plan.service.INmisWorkPlanService;

/**
 * 工作计划Service业务层处理
 * 
 * @author ydl
 * @date 2025-03-25
 */
@Service
public class NmisWorkPlanServiceImpl implements INmisWorkPlanService 
{
    @Autowired
    private NmisWorkPlanMapper nmisWorkPlanMapper;

    /**
     * 查询工作计划
     * 
     * @param id 工作计划主键
     * @return 工作计划
     */
    @Override
    public NmisWorkPlan selectNmisWorkPlanById(Long id)
    {
        return nmisWorkPlanMapper.selectNmisWorkPlanById(id);
    }

    /**
     * 查询工作计划列表
     * 
     * @param nmisWorkPlan 工作计划
     * @return 工作计划
     */
    @Override
    public List<NmisWorkPlan> selectNmisWorkPlanList(NmisWorkPlan nmisWorkPlan)
    {
        return nmisWorkPlanMapper.selectNmisWorkPlanList(nmisWorkPlan);
    }

    /**
     * 新增工作计划
     * 
     * @param nmisWorkPlan 工作计划
     * @return 结果
     */
    @Override
    public int insertNmisWorkPlan(NmisWorkPlan nmisWorkPlan)
    {
        return nmisWorkPlanMapper.insertNmisWorkPlan(nmisWorkPlan);
    }

    /**
     * 修改工作计划
     * 
     * @param nmisWorkPlan 工作计划
     * @return 结果
     */
    @Override
    public int updateNmisWorkPlan(NmisWorkPlan nmisWorkPlan)
    {
        return nmisWorkPlanMapper.updateNmisWorkPlan(nmisWorkPlan);
    }

    /**
     * 批量删除工作计划
     * 
     * @param ids 需要删除的工作计划主键
     * @return 结果
     */
    @Override
    public int deleteNmisWorkPlanByIds(Long[] ids)
    {
        if(ids == null || ids.length == 0)
        {
            throw new ServiceException("请选择待删除的数据");
        }
        for (Long id : ids)
        {
            NmisWorkPlan plan = selectNmisWorkPlanById(id);
            if(plan==null)
            {
                throw new ServiceException("工作计划不存在");
            }
            if(!plan.getPlanStatus().equals("1"))
            {
                throw new ServiceException(String.format("计划名称：%s，仅草稿状态的计划才能删除！", plan.getPlanName()));
            }
        }

        return nmisWorkPlanMapper.deleteNmisWorkPlanByIds(ids);
    }

    /**
     * 删除工作计划信息
     * 
     * @param id 工作计划主键
     * @return 结果
     */
    @Override
    public int deleteNmisWorkPlanById(Long id)
    {
        NmisWorkPlan plan = selectNmisWorkPlanById(id);
        if(plan==null)
        {
            throw new ServiceException("工作计划不存在");
        }
        if(!plan.getPlanStatus().equals("1"))
        {
            throw new ServiceException("仅草稿状态的计划才能删除！");
        }
        return nmisWorkPlanMapper.deleteNmisWorkPlanById(id);
    }

    /**
     * 提交工作计划
     * @param nmisWorkPlan
     * @return
     */
    public int commitNmisWorkPlan(NmisWorkPlan nmisWorkPlan)
    {
        NmisWorkPlan plan = selectNmisWorkPlanById(nmisWorkPlan.getId());
        if(plan==null)
        {
            throw new ServiceException("工作计划不存在");
        }
        if(!plan.getPlanStatus().equals("1"))
        {
            throw new ServiceException("仅草稿状态的计划才能提交！");
        }
        nmisWorkPlan.setPlanStatus("2");
        return nmisWorkPlanMapper.updateNmisWorkPlan(nmisWorkPlan);
    }

    /**
     * 撤销提交工作计划
     * @param nmisWorkPlan
     * @return
     */
    public int uncommitNmisWorkPlan(NmisWorkPlan nmisWorkPlan)
    {
        NmisWorkPlan plan = selectNmisWorkPlanById(nmisWorkPlan.getId());
        if(plan==null)
        {
            throw new ServiceException("工作计划不存在");
        }
        if(plan.getPlanStatus().equals("3"))
        {
            throw new ServiceException("当前工作计划已审批，不能撤销！");
        }
        if(plan.getPlanStatus().equals("0"))
        {
            throw new ServiceException("当前工作计划为草稿状态，您无需撤销！");
        }
        nmisWorkPlan.setPlanStatus("1");
        return nmisWorkPlanMapper.updateNmisWorkPlan(nmisWorkPlan);
    }

    /**
     * 审批提交工作计划
     * @param nmisWorkPlan
     * @return
     */
    public int approveNmisWorkPlan(NmisWorkPlan nmisWorkPlan)
    {
        NmisWorkPlan plan = selectNmisWorkPlanById(nmisWorkPlan.getId());
        if(plan==null)
        {
            throw new ServiceException("工作计划不存在");
        }
        if(!plan.getPlanStatus().equals("2"))
        {
            throw new ServiceException("只能审批提交状态的工作计划！");
        }
        return nmisWorkPlanMapper.updateNmisWorkPlan(nmisWorkPlan);
    }

    /**
     * 取消审批提交工作计划
     * @param nmisWorkPlan
     * @return
     */
    public int unApproveNmisWorkPlan(NmisWorkPlan nmisWorkPlan)
    {
        NmisWorkPlan plan = selectNmisWorkPlanById(nmisWorkPlan.getId());
        if(plan==null)
        {
            throw new ServiceException("工作计划不存在");
        }
        if(!plan.getPlanStatus().equals("3"))
        {
            throw new ServiceException("只能已审批状态的工作计划才能取消审批！");
        }
        return nmisWorkPlanMapper.updateNmisWorkPlan(nmisWorkPlan);
    }
}
