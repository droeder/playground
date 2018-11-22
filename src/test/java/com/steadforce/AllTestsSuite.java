package com.steadforce;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.steadforce.main", "com.steadforce.other"})
public class AllTestsSuite {

}
