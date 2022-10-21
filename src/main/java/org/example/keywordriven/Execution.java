package org.example.keywordriven;

public class Execution {
    public static void main(String args[]){
        String path = "C:\\Users\\fatiu\\Desktop\\Keyword Driven Framework.xlsx";
        Excelutility.setExcel(path, 0);

        for(int i = 0; i<=3; i++ ){
            String keyword = Excelutility.getData(i, 3);
            if(keyword.equals("openBrowser")){
                KeywordsDrivenFrame.openBrowser();
            }
            else if(keyword.equals("navigateToWebsite")){
                KeywordsDrivenFrame.navigateToWebsite();
            }
            else if(keyword.equals("clickSearch")){
                KeywordsDrivenFrame.clickSearch();
            }
        }
    }
}
