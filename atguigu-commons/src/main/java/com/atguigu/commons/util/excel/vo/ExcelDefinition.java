package com.atguigu.commons.util.excel.vo;


import java.util.ArrayList;
import java.util.List;

/**
 * Excel定义
 * 
 * @author zhangyj
 *
 */
public class ExcelDefinition {

	/** ID,必须 */
	private String id;

	/** 全类名,必须 */
	private String className;

	/** Class信息 */
	private Class<?> clazz;

	/**导出时,sheet页的名称,可以不设置*/
	private String sheetname;
	
	/**导出时,sheet页所有的默认列宽,可以不设置*/
	private Integer defaultColumnWidth;
	
	/**导出时,cell默认对其方式:支持,center,left,right*/
	private Short defaultAlign;

	/** Field属性的全部定义 */
	private List<FieldValue> fieldValues = new ArrayList<>();
	
	/** 是否开启导出样式支持,(数据量很大时,不建议开启),底层可能会抛出异常,具体查询底层实现WorkBook.createCellStyle */
	private Boolean enableStyle = false;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}

	public List<FieldValue> getFieldValues() {
		return fieldValues;
	}

	public void setFieldValues(List<FieldValue> fieldValues) {
		this.fieldValues = fieldValues;
	}

	public String getSheetname() {
		return sheetname;
	}
	
	public void setSheetname(String sheetname) {
		this.sheetname = sheetname;
	}

	public Integer getDefaultColumnWidth() {
		return defaultColumnWidth;
	}

	public void setDefaultColumnWidth(Integer defaultColumnWidth) {
		this.defaultColumnWidth = defaultColumnWidth;
	}

	public Boolean getEnableStyle() {
		return enableStyle;
	}

	public void setEnableStyle(Boolean enableStyle) {
		this.enableStyle = enableStyle;
	}

	public Short getDefaultAlign() {
		return defaultAlign;
	}

	public void setDefaultAlign(Short defaultAlign) {
		this.defaultAlign = defaultAlign;
	}


}
