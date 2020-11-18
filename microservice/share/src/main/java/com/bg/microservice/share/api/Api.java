package com.bg.microservice.share.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
* Returns an Image object that can then be painted on the screen. 
* The url argument must specify an absolute <a href="#{@link}">{@link URL}</a>. The name
* argument is a specifier that is relative to the url argument. 
* <p>
* This method always returns immediately, whether or not the 
* image exists. When this applet attempts to draw the image on
* the screen, the data will be loaded. The graphics primitives 
* that draw the image will incrementally paint on the screen. 
*
* @param  url  an absolute URL giving the base location of the image
* @param  name the location of the image, relative to the url argument
* @return      the image at the specified URL
* @see         Image
*/
public class Api {

	private static String split = "\\|";
    private String       name;  // endpoint
    private String       regex;
    private List<String> parameterNames;
    private HashMap<String,String>  http2Method;
    private String       resource;
    private int          build;
//
    /*
     * Constructor for api
     */
    public Api() {
        http2Method = new HashMap<>();
        parameterNames = new ArrayList<>();
    }

    @Override
	public String toString() {
		return super.toString();
	}

	public List<String> getParameterNames() {
        return parameterNames;
    }

    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;

        String[]      strings       = name.split("/");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0, len = strings.length; i < len; i++) {
            if (strings[i].length() == 0) {
                continue;
            }
            stringBuilder.append("/");
            if (strings[i].startsWith(":")) {
                parameterNames.add(strings[i].substring(1));
                stringBuilder.append("([^/]+)");
            } else {
                stringBuilder.append(strings[i]);
            }
        }

        this.regex = stringBuilder.toString();
    }

    public HashMap<String,String> getHttpMethod() {
        return http2Method;
    }

    public int getBuild() {
        return build;
    }

    public void setBuild(int build) {
        this.build = build;
    }

    /**
     * Add http method for api level
     * @param httpMethod
     */
    public void addHttpMethod(String httpMethod) {
    	String[]h2m = httpMethod.split(split);
        this.http2Method.put(h2m[0], h2m[1]);
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getRegex() {
        return regex;
    }
}
