/**
 * 
 */
package org.sagacity.sqltoy.plugin.function;

import org.sagacity.sqltoy.plugin.IFunction;
import org.sagacity.sqltoy.utils.StringUtil;
import org.sagacity.sqltoy.utils.DataSourceUtils.DBType;

/**
 * @project sqltoy-orm
 * @description 针对mysql数据库字符连接函数concat_ws在其它数据库中的函数转换
 * @author renfei.chen <a href="mailto:zhongxuchen@gmail.com">联系作者</a>
 * @version id:ConcatWs.java,Revision:v1.0,Date:2013-3-21
 */
public class ConcatWs extends IFunction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sagacity.sqltoy.config.function.IFunction#dialects()
	 */
	@Override
	public String dialects() {
		return "oracle12c";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sagacity.sqltoy.config.function.IFunction#regex()
	 */
	@Override
	public String regex() {
		return "(?i)\\Wconcat\\_ws\\(";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sagacity.sqltoy.config.function.IFunction#wrap(int,
	 * java.lang.String[])
	 */
	@Override
	public String wrap(int dialect, String functionName, boolean hasArgs, String... args) {
		// 只针对oracle数据库,其他数据库原样返回
		if (dialect == DBType.ORACLE || dialect == DBType.ORACLE12) {
			StringBuilder result = new StringBuilder();
			String split = StringUtil.replaceAllStr(args[0], "\'", "''");
			for (int i = 1; i < args.length; i++) {
				if (i > 1) {
					result.append("||").append(split).append("||");
				}
				result.append(StringUtil.replaceAllStr(args[i], "\'", "''"));
			}
			return result.toString();
		}
		return null;
	}

}