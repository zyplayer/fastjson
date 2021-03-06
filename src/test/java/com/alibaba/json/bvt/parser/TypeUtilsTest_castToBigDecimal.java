package com.alibaba.json.bvt.parser;

import com.alibaba.fastjson.util.TypeUtils;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * 强转BigDecimal测试用例
 */
public class TypeUtilsTest_castToBigDecimal extends TestCase {
	
	/**
	 * NaN和正负无穷大的时候转BigDecimal都会报转换异常，修改为返回null
	 */
	public void test_FloatNanInfinite() throws Exception {
		// 正无穷大
		Assert.assertNull(TypeUtils.castToBigDecimal(1.0f / 0.0f));
		// 负无穷大
		Assert.assertNull(TypeUtils.castToBigDecimal(-1.0f / 0.0f));
		// NaN
		Assert.assertNull(TypeUtils.castToBigDecimal(0.0f / 0.0f));
	}
	
	/**
	 * NaN和正负无穷大的时候转BigDecimal都会报转换异常，修改为返回null
	 */
	public void test_DoubleNanInfinite() throws Exception {
		// 正无穷大
		Assert.assertNull(TypeUtils.castToBigDecimal(1.0d / 0.0d));
		// 负无穷大
		Assert.assertNull(TypeUtils.castToBigDecimal(-1.0d / 0.0d));
		// NaN
		Assert.assertNull(TypeUtils.castToBigDecimal(0.0d / 0.0d));
	}
	
}
