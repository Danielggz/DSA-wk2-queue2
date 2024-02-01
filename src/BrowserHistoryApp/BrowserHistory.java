/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BrowserHistoryApp;

/**
 * @author Daniel García
 * 1 feb 2024
 */
public class BrowserHistory {
    private String url, pageTitle;

    public BrowserHistory(String url, String pageTitle) {
        this.url = url;
        this.pageTitle = pageTitle;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getUrl() {
        return url;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    @Override
    public String toString() {
        return "BrowserHistory:\n" + "Url: " + url + "\nPage title: " + pageTitle;
    }
    
    
}
