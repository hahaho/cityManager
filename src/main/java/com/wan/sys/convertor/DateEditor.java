package com.wan.sys.convertor;

import java.beans.PropertyEditorSupport;
import java.util.Date;

import com.wan.sys.util.DateUtil;
/**
 * 
 * 文件名称：springMvc 日期转换器 
 * 内容摘要： 
 * 创建人： 唐君左
 * 创建日期： 2017-6-26
 * 版本号： v1.0.0
 * 公  司：金科物业服务有限公司
 * 版权所有： (C)2016-2017     
 * 修改记录1 
 * 修改日期：
 * 版本号：
 * 修改人：
 * 修改内容：  
 *
 */
public class DateEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text)  {
		Date date = DateUtil.smartFormat(text);
		setValue(date);
	}

}
