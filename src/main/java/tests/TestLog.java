package tests;


import org.apache.log4j.Logger;

/**
 * @author: Zhen Chen
 * @email: 15011074486@163.com
 * @date: Jun 19, 2019, 11:17:30 AM
 * @Desc: test logging useage
 *
 *
 * 
 */

public class TestLog {
	private static Logger logger = Logger.getLogger(TestLog.class); 
	
	public static void main(String[] args) {
		// 记录debug级别的信息  
        logger.debug("This is debug message.");  
        
        // 记录info级别的信息  
        logger.info("This is info message.");  
        
        // 记录error级别的信息  
        logger.error("This is error message.");
	}

}
