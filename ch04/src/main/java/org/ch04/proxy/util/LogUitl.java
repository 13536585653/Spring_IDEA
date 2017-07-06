package org.ch04.proxy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by langye on 2017/2/17.
 */
public class LogUitl {

private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

public static void log() {
	System.out.println("记录日志操作，记录时间"+format.format(new Date()));
}
}
