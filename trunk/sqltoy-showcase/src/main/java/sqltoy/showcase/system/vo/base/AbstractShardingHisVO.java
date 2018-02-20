/**
 *@Generated by sagacity-quickvo 4.0
 */
package sqltoy.showcase.system.vo.base;

import java.io.Serializable;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.math.BigDecimal;
import java.util.Date;


/**
 * @project sqltoy-showcase
 * @version 1.0.0
 * Table: sys_sharding_his,Remark:分片测试历史表   
 */
@Entity(tableName="sys_sharding_his",pk_constraint="PRIMARY")
public abstract class AbstractShardingHisVO implements Serializable,
	java.lang.Cloneable {
	 /*--------------- properties string,handier to copy ---------------------*/
	 //full properties 
	 //id,staffId,postType,createTime,comments
	 
	 //not null properties
	 //id,staffId,createTime

	/**
	 * 
	 */
	private static final long serialVersionUID = 5824795197471364112L;
	
	/**
	 * 编号
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugin.id.DefaultIdGenerator")
	@Column(name="ID",length=22L,type=java.sql.Types.DECIMAL,nullable=false)
	protected BigDecimal id;
	
	/**
	 * 员工工号
	 */
	@Column(name="STAFF_ID",length=30L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String staffId;
	
	/**
	 * 岗位类别
	 */
	@Column(name="POST_TYPE",length=30L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String postType;
	
	/**
	 * 创建时间
	 */
	@Column(name="CREATE_TIME",length=26L,type=java.sql.Types.DATE,nullable=false)
	protected Date createTime;
	
	/**
	 * 说明
	 */
	@Column(name="COMMENTS",length=1000L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String comments;
	


	/** default constructor */
	public AbstractShardingHisVO() {
	}
	
	/** pk constructor */
	public AbstractShardingHisVO(BigDecimal id)
	{
		this.id=id;
	}

	/** minimal constructor */
	public AbstractShardingHisVO(BigDecimal id,String staffId,Date createTime)
	{
		this.id=id;
		this.staffId=staffId;
		this.createTime=createTime;
	}

	/** full constructor */
	public AbstractShardingHisVO(BigDecimal id,String staffId,String postType,Date createTime,String comments)
	{
		this.id=id;
		this.staffId=staffId;
		this.postType=postType;
		this.createTime=createTime;
		this.comments=comments;
	}
	
	/**
	 *@param id the id to set
	 */
	public void setId(BigDecimal id) {
		this.id=id;
	}
		
	/**
	 *@return the Id
	 */
	public BigDecimal getId() {
	    return this.id;
	}
	
	/**
	 *@param staffId the staffId to set
	 */
	public void setStaffId(String staffId) {
		this.staffId=staffId;
	}
		
	/**
	 *@return the StaffId
	 */
	public String getStaffId() {
	    return this.staffId;
	}
	
	/**
	 *@param postType the postType to set
	 */
	public void setPostType(String postType) {
		this.postType=postType;
	}
		
	/**
	 *@return the PostType
	 */
	public String getPostType() {
	    return this.postType;
	}
	
	/**
	 *@param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime=createTime;
	}
		
	/**
	 *@return the CreateTime
	 */
	public Date getCreateTime() {
	    return this.createTime;
	}
	
	/**
	 *@param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments=comments;
	}
		
	/**
	 *@return the Comments
	 */
	public String getComments() {
	    return this.comments;
	}



	/**
     * @todo vo columns to String
     */
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("id=").append(getId()).append("\n");
		columnsBuffer.append("staffId=").append(getStaffId()).append("\n");
		columnsBuffer.append("postType=").append(getPostType()).append("\n");
		columnsBuffer.append("createTime=").append(getCreateTime()).append("\n");
		columnsBuffer.append("comments=").append(getComments()).append("\n");
		return columnsBuffer.toString();
	}
}
