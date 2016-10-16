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
package fr.davidson.sample.jee.jsf;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 * Exemples de code.
 *
 * @author marc.bouvier@davidson.fr 
 */
@ManagedBean(name = "codeExemples")
@RequestScoped
public class CodeExemplesManagedBean {
    String messageFromManagedBean1="public void addMessage() {\n" +
"   FacesContext context = FacesContext.getCurrentInstance();\n" +
"   context.addMessage(\"formMessage:buttonMessage\",\n" +
"      new FacesMessage(FacesMessage.SEVERITY_INFO, \"Résumé du message\", \"Détail du message\"));\n" +
"}";
    String messageFromManagedBean="<h:form id=\"formMessage\">\n" +
"    <h:commandButton id=\"buttonMessage\" value=\"Ajouter un message\" actionListener=\"#{messagesManagedBean.addMessage}\" />\n" +
"    <h:message for=\"buttonMessage\"  showSummary=\"true\" showDetail=\"true\" />\n" +
"</h:form>";
    String messagesTable="<h:messages tooltip=\"true\" layout=\"table\"/>";
    String messages="<h:messages />";
    
    String messageInput="<h:form>\n" +
"    <h:outputLabel value=\"UserName\"  for=\"userName\"/>\n" +
"    <h:inputText id=\"userName\" value=\"#{messagesManagedBean.userName}\"\n" +
"                 size=\"20\" required=\"true\" label=\"UserName\" >\n" +
"        <f:validateLength minimum=\"5\" maximum=\"10\" />\n" +
"    </h:inputText>\n" +
"    <h:outputLabel value=\"email\"  for=\"email\"/>\n" +
"    <h:inputText id=\"email\" value=\"#{messagesManagedBean.email}\"\n" +
"                 required=\"true\" label=\"Email\" validatorMessage=\"email incorrect\" >\n" +
"        <f:validateRegex pattern=\"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$\" />\n" +
"    </h:inputText>\n" +
"    <h:commandButton value=\"Soumettre\"/>\n" +
"    <h:message for=\"userName\" style=\"color:red\"   />\n" +
"</h:form>	";
    
    String cssResourceFromEl="<link rel=\"stylesheet\" href=\"#{resource['css:style.css']}\"  type=\"text/css\"/>";
    String cssOutputStyle="<h:outputStylesheet   name=\"style.css\" library=\"css\" />";
    String cssResourceImage="background-image: url(\"#{resource['images/davidson_txt_161x17_padding_5px.png']}\");";
    
    String commandLinkClickMeAjax="<h:form>\n" +
"    <h:commandLink value=\"Cliquez-moi en ajax!\" actionListener=\"#{commandLinkManagedBean.onClickAjax}\" >\n" +
"        <f:ajax render=\":clickedLabelAjax\"/>\n" +
"    </h:commandLink>\n" +
"</h:form>\n" +
"<h:panelGroup id=\"clickedLabelAjax\">\n" +
"    <p>Lors du clic en ajax, seule cette valeur est rafraichie :</p>\n" +
"    <h:outputText rendered=\"#{not empty commandLinkManagedBean.clickedLabel}\"\n" +
"                  value=\"#{commandLinkManagedBean.clickedLabel}\" style=\"color:green\"/>\n" +
"</h:panelGroup>";
    
    String commandLinkClickMe="<h:form>\n" +
"    <h:commandLink value=\"Cliquez-moi!\" actionListener=\"#{commandLinkManagedBean.onClick}\" ></h:commandLink>\n" +
"</h:form>\n" +
"<h:panelGroup id=\"clickedLabel\">\n" +
"    <p>Valeur </p>\n" +
"    <h:outputText rendered=\"#{not empty commandLinkManagedBean.clickedLabel}\"\n" +
"                  value=\"#{commandLinkManagedBean.clickedLabel}\" style=\"color:red\"/>\n" +
"</h:panelGroup>";
    
    String customHelloConverter="@Named(\"helloConverter\")\n" +
"public class HelloConverter implements Converter{\n" +
"\n" +
"    @Override\n" +
"    public Object getAsObject(FacesContext context, UIComponent component, String value) {\n" +
"        return value;\n" +
"    }\n" +
"\n" +
"    @Override\n" +
"    public String getAsString(FacesContext context, UIComponent component, Object value) {\n" +
"        return((String)value).replace(\"hello\", \"\");\n" +
"    }\n" +
"    \n" +
"}";
    
    String renderedDynamic="<h:form id=\"worldForm\">\n" +
"    <h:selectBooleanCheckbox id=\"afficherWorld\" value=\"#{renderedManagedBean.afficherWorld}\"  >\n" +
"        <f:ajax event=\"change\" execute=\"@form\" render=\":worldPanel\"/>\n" +
"    </h:selectBooleanCheckbox>\n" +
"</h:form>\n" +
"<h:panelGroup id=\"worldPanel\">\n" +
"    <h:outputText rendered=\"#{renderedManagedBean.afficherWorld}\" value=\"World !\"/>\n" +
"</h:panelGroup>";
    
    String convertDateTimeLocaleJp="<h:outputText value=\"#{managedBean1.dateCourante}\">\n" +
"    <f:convertDateTime  locale=\"ja_JP\"/>\n" +
"</h:outputText>";
    
    String convertDateTimeLocaleFr="<h:outputText value=\"#{managedBean1.dateCourante}\">\n" +
"    <f:convertDateTime  locale=\"fr_FR\"/>\n" +
"</h:outputText>";
    
    String convertDateTimeDateStyle="<h:outputText value=\"#{managedBean1.dateCourante}\">\n" +
"   <f:convertDateTime  dateStyle=\"long\"/>\n" +
"</h:outputText>";
    String convertDateTimePattern="<h:outputText value=\"#{managedBean1.dateCourante}\">\n" +
"   <f:convertDateTime  pattern=\"yyyy-MM-dd\"/>\n" +
"</h:outputText>";
    
    String faceletSimple="<?xml version='1.0' encoding='UTF-8' ?>\n" +
"<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n" +
"<html xmlns=\"http://www.w3.org/1999/xhtml\"\n" +
"xmlns:h=\"http://java.sun.com/jsf/html\"\n" +
"xmlns:ui=\"http://java.sun.com/jsf/facelets\"\n" +
"xmlns:f=\"http://java.sun.com/jsf/core\">\n" +
"    <h:head>\n" +
"        <title>Facelet</title>\n" +
"        <h:outputStylesheet  name=\"style.css\" library=\"css\" />\n" +
"    </h:head>\n" +
"    <h:body>\n" +
"        <h1>Facelet simple</h1>\n" +
"        <p>Cette facelet ne contient qu'un texte simple</p>\n" +
"        <p>\n" +
"            <h:link value=\"Retour\" outcome=\"index\"/>\n" +
"        </p>\n" +
"    </h:body>\n" +
"</html>\n" +
"\n" +
"";
    
    String faceletEtManagedBean="<h:outputText value=\"#{managedBean1.dateCourante}\" >\n" +
"   <f:convertDateTime pattern=\"dd/MM/yyyy HH:mm\" />\n" +
"</h:outputText>";

   
  String uiRepeatJsfc="<table style=\"border: solid 1px\">\n" +
"    <tr jsfc=\"ui:repeat\" value=\"#{iterationManagedBean.liste}\" var=\"item\" varStatus=\"status\">\n" +
"        <td>#{item.cle}</td><td>#{item.valeur}</td>\n" +
"    </tr>\n" +
"</table>";
  
  String uiRepeatStatus="<ui:repeat value=\"#{iterationManagedBean.liste}\" var=\"item\" varStatus=\"status\">\n" +
"    <p style=\"#{status.odd?'color:red':'color:aqua'}\">#{item.cle} - #{item.valeur} \n" +
"        (status.odd : #{status.odd}, status.even : #{status.even}, status.index : #{status.index})</p>\n" +
"</ui:repeat>";

    public String getUiRepeatJsfc() {
        return uiRepeatJsfc;
    }

    public String getUiRepeatStatus() {
        return uiRepeatStatus;
    }

    public String getFaceletEtManagedBean() {
        return faceletEtManagedBean;
    }

    public String getFaceletSimple() {
        return faceletSimple;
    }

    public String getConvertDateTimePattern() {
        return convertDateTimePattern;
    }

    public String getConvertDateTimeDateStyle() {
        return convertDateTimeDateStyle;
    }

    public String getConvertDateTimeLocaleFr() {
        return convertDateTimeLocaleFr;
    }

    public String getConvertDateTimeLocaleJp() {
        return convertDateTimeLocaleJp;
    }

    public String getRenderedDynamic() {
        return renderedDynamic;
    }

    public String getCustomHelloConverter() {
        return customHelloConverter;
    }

    public String getCommandLinkClickMe() {
        return commandLinkClickMe;
    }

    public String getCommandLinkClickMeAjax() {
        return commandLinkClickMeAjax;
    }

    public String getCssResourceImage() {
        return cssResourceImage;
    }

    public String getCssResourceFromEl() {
        return cssResourceFromEl;
    }

    public String getCssOutputStyle() {
        return cssOutputStyle;
    }

    public String getMessageInput() {
        return messageInput;
    }

    public String getMessages() {
        return messages;
    }

    public String getMessagesTable() {
        return messagesTable;
    }

    public String getMessageFromManagedBean() {
        return messageFromManagedBean;
    }

    public String getMessageFromManagedBean1() {
        return messageFromManagedBean1;
    }
    
    
}
