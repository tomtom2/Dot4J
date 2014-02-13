package com.github.tomto2.dot4j;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.github.tomtom2.dot4j.api.AllApiTest;
import com.github.tomtom2.dot4j.api.writer.AllWriterTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ AllWriterTest.class, AllApiTest.class} )
public class AllTests {

}
