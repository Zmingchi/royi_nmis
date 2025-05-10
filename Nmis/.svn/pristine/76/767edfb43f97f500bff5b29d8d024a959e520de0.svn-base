package com.ydl.nmis.base.domain;

import java.util.List;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 护理通用字典对象 nmis_comm_type_dict
 * 
 * @author ydl
 * @date 2024-04-24
 */
public class NmisCommTypeDict extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 字典名称 */
    @Excel(name = "字典名称")
    private String typeName;

    /** 输入码 */
    @Excel(name = "输入码")
    private String inputCode;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long serialNo;

    /** 字典编码 */
    @Excel(name = "字典编码")
    private String typeCode;

    /** 护理通用字典信息 */
    private List<NmisCommDict> nmisCommDictList;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTypeName(String typeName) 
    {
        this.typeName = typeName;
    }

    public String getTypeName() 
    {
        return typeName;
    }
    public void setInputCode(String inputCode) 
    {
        this.inputCode = inputCode;
    }

    public String getInputCode() 
    {
        return inputCode;
    }
    public void setSerialNo(Long serialNo) 
    {
        this.serialNo = serialNo;
    }

    public Long getSerialNo() 
    {
        return serialNo;
    }
    public void setTypeCode(String typeCode) 
    {
        this.typeCode = typeCode;
    }

    public String getTypeCode() 
    {
        return typeCode;
    }

    public List<NmisCommDict> getNmisCommDictList()
    {
        return nmisCommDictList;
    }

    public void setNmisCommDictList(List<NmisCommDict> nmisCommDictList)
    {
        this.nmisCommDictList = nmisCommDictList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("typeName", getTypeName())
            .append("inputCode", getInputCode())
            .append("serialNo", getSerialNo())
            .append("typeCode", getTypeCode())
            .append("nmisCommDictList", getNmisCommDictList())
            .toString();
    }
}
