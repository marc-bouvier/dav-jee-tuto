/*
 * This is free and unencumbered software released into the public domain.
 * 
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 * 
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 * 
 * For more information, please refer to <http://unlicense.org>
 */
package fr.davidson.sample.jee.jaxrs.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author osboxes
 */
@XmlRootElement(name = "restDocumentation")
public class  RestDocumentation {

    
   private  List<RestResourceHelp> resourceHelps;

    public RestDocumentation() {
        this.resourceHelps = new ArrayList<RestResourceHelp>();
    }
    
    public RestResourceHelp addResourceHelp(
            final String path,final String method,final String help,final String ... exemples){
        final RestResourceHelp restResourceHelp = new RestResourceHelp(path,method,help);
        restResourceHelp.getExemples().addAll(Arrays.asList(exemples));
        resourceHelps.add(restResourceHelp);
        return restResourceHelp;
    }

    public List<RestResourceHelp> getResourceHelps() {
        return resourceHelps;
    }

    public void setResourceHelps(List<RestResourceHelp> resourceHelps) {
        this.resourceHelps = resourceHelps;
    }

    @Override
    public String toString() {
        return "RestDocumentation{" + "resourceHelps=" + resourceHelps + '}';
    }
    
    
    
    
}
