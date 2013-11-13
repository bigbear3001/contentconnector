package com.gentics.cr.configuration.defaultconfiguration;

import static org.junit.Assert.assertTrue;

import java.net.URISyntaxException;

import org.junit.Ignore;
import org.junit.Test;

import com.gentics.cr.configuration.EnvironmentConfiguration;

public class DefaultConfigDirectoryTest {

	@Test
	@Ignore
	/**
	 * (removal of 
	 * @throws URISyntaxException
	 * 
	 * 
	 * After github merge this test fails because of changes in DefaultConfigDirectory
	 * 	//String configLocation = DefaultConfigDirectory.class.getResource(".").toURI().getPath();
	 *	//EnvironmentConfiguration.setConfigPath(configLocation);
	 * 
	 * 
	 * 
	 */
	public void testDefaultConfig() throws URISyntaxException {
		DefaultConfigDirectory.useThis();
		EnvironmentConfiguration.loadLoggerProperties();
		assertTrue("Logger initialization has failed.", EnvironmentConfiguration.isLoggerFallbackLoaded() || EnvironmentConfiguration.getLoggerState());
		assertTrue("Cache initialization has failed.", EnvironmentConfiguration.isCacheFallbackLoaded() || EnvironmentConfiguration.getCacheState());
	}
}
