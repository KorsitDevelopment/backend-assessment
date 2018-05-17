/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.korsit.productassessment.providers;

import javax.ws.rs.ext.*;
import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.glassfish.jersey.moxy.json.MoxyJsonConfig;

/**
 *
 * @author b.vaan
 */
@Provider
public class MOXyJsonContextResolver implements ContextResolver<MoxyJsonConfig> {
 
    private final MoxyJsonConfig config;
 
    public MOXyJsonContextResolver() {
        config = new MoxyJsonConfig()
            .setAttributePrefix("")
            .setValueWrapper("value")
            .property(JAXBContextProperties.JSON_WRAPPER_AS_ARRAY_NAME, true);
    }
 
    @Override
    public MoxyJsonConfig getContext(Class<?> objectType) {
        return config;
    }
 
}
