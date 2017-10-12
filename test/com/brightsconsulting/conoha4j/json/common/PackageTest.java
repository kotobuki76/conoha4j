package com.brightsconsulting.conoha4j.json.common;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AuthTest.class, LinkTest.class, MediaTypeTest.class, ServerTest.class, VersionTest.class,
		VersionsTest.class, })

public class PackageTest {

	public PackageTest() {

	}

	public static void main(String[] args) {
		JUnitCore.main(PackageTest.class.getName());
	}
}
