package com.jeecg.qywx.base.entity;

import java.io.Serializable;
import java.util.Date;

import com.jeecg.qywx.util.SystemUtil;

/**
 * 描述：</b>QywxGzuserinfo:关注用户; InnoDB free: 130048 kB<br>
 * 实体定义规则
 * 字段不允许存在基本类型，必须都是包装类型(因为基本类型有默认值)
 * 基本数据类型  包装类 byte Byte boolean Boolean short Short char Character int Integer long Long float Float double  Double 
 * @author zhoujf
 * @since：2016年03月25日 15时24分11秒 星期五 
 * @version:1.0
 */
public class QywxGzuserinfo implements Serializable{
	private static final long serialVersionUID = 1L;
	
		return SystemUtil.QYWX_ACCOUNT_ID;
	@Override
	public String toString() {
		return "QywxGzuserinfo [id=" + id + ", userid=" + userid + ", name="
				+ name + ", department=" + department + ", position="
				+ position + ", mobile=" + mobile + ", province=" + province
				+ ", gender=" + gender + ", email=" + email + ", weixinid="
				+ weixinid + ", avatar=" + avatar + ", subscribeStatus="
				+ subscribeStatus + ", subscribeTime=" + subscribeTime
				+ ", accountid=" + accountid + ", createName=" + createName
				+ ", createBy=" + createBy + ", createDate=" + createDate
				+ ", updateName=" + updateName + ", updateBy=" + updateBy
				+ ", updateDate=" + updateDate + "]";
	}
}
