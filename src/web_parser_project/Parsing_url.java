/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web_parser_project;

import java.util.LinkedList;

/**
 *
 * @author Jason
 */
public class Parsing_url {
    private String the_url;
    private LinkedList<String> urls_which_reference_url;
    private int http_code;
    private boolean error;
    private String content_type;
    
    public Parsing_url(String url){
        urls_which_reference_url = new LinkedList();
        the_url = url;
        error = false;
    }
    
    public void set_url(String inc_url){the_url = inc_url;}
    public String get_url(){return the_url;}
    
    public void set_http_code(int http_cde){http_code = http_cde;}
    public int get_http_code(){return http_code;}
    
    public void set_content_type(String c_type){content_type = c_type;}
    public String get_content_Type(){return content_type;}
    
    public LinkedList<String> get_references(){return urls_which_reference_url;}   
    public void add_to_reference(String url){ urls_which_reference_url.add(url);}    
    
    public boolean get_error(){ return error;}
    public void set_error(boolean value){error = value;}
    
    public boolean is_404(){
        return Html_helper.is_404(http_code);
    }
    
    public boolean is_200_ok(){
        return Html_helper.is_200(http_code);
    }
    
    
    
}
