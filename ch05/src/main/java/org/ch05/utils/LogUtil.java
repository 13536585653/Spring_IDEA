package org.ch05.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by langye on 2017/2/20.
 */
public class LogUtil {

private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

public static void log() {
	System.out.println("记录日志操作，记录时间"+format.format(new Date()));
}
}
