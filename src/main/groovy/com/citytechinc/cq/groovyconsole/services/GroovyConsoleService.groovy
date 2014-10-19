package com.citytechinc.cq.groovyconsole.services

import java.util.Map;

import org.apache.sling.api.SlingHttpServletRequest


interface GroovyConsoleService {

    Map<String, String> runScript(SlingHttpServletRequest request)
    
    Map<String, String> runScriptAtPath(ResourceResolver resourceResolver, String script)

    Map<String, String> saveScript(SlingHttpServletRequest request)
}