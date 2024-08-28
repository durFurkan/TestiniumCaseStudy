package com.testinium.pages;

import com.testinium.utilities.ConfigurationReader;
import com.testinium.utilities.Driver;
import com.testinium.utilities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    ExcelUtil excelUtil = new ExcelUtil("src/test/resources/categoryName.xlsx", "Sheet");
    @FindBy(xpath = "//header")
    public WebElement header;
    @FindBy(className = "o-header__search--wrapper")
    public WebElement searchBoxFrame;
    @FindBy(id = "o-searchSuggestion__input")
    public WebElement searchBoxInput;

    public void navigateToTheURL(String genderID) {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().findElement(By.id("onetrust-accept-btn-handler")).click();
        Driver.get().findElement(By.id(genderID)).click();
        Driver.get().findElement(By.xpath("//button[text()='No Thanks']")).click();
    }
    public void enterProductNameToSearchBox(int row, int column) {
        searchBoxFrame.click();
        searchBoxInput.sendKeys(excelUtil.getCellData(row, column));
        silButton.click();
    }
    public void enterProductNameAndPressEnterForSearchBox(int row, int column) {
        searchBoxInput.sendKeys(excelUtil.getCellData(row, column) + Keys.ENTER);
    }
}
