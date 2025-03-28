package org.mule.extension.parquet.internal;

import static org.mule.sdk.api.meta.JavaVersion.JAVA_11;
import static org.mule.sdk.api.meta.JavaVersion.JAVA_17;
import static org.mule.sdk.api.meta.JavaVersion.JAVA_8;
import static org.mule.runtime.api.meta.Category.CERTIFIED;

import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;
import org.mule.sdk.api.annotation.JavaVersionSupport;

/**
 * This is the main class of an extension, is the entry point from which configurations, connection providers, operations
 * and sources are going to be declared.
 */
@Xml(prefix = "parquet")
@Extension(name = "Parquet Connector", category = CERTIFIED, vendor = "Dejim Juang")
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
@Configurations(ParquetConfiguration.class)
@JavaVersionSupport({JAVA_8, JAVA_11, JAVA_17})
public class ParquetExtension {

}
