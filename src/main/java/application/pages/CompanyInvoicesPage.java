package application.pages;

import framework.elements.Label;
import lombok.Data;
import org.openqa.selenium.By;

@Data
public class CompanyInvoicesPage {
    private Label companyNameLabel = new Label(By.xpath("//tbody[contains(@class, 'tgl')]//td[@class='cal'][last()-1]"), "Company Name");
    private Label invoiceAddressLabel = new Label(By.xpath("//tbody[contains(@class, 'tgl')]//td[@class='cal'][last()]"), "Invoice Address");
    private Label grade = getGradeWeightLabel("fc", "Grade");
    private Label weight = getGradeWeightLabel("car", "Weight");
    private Label flatCharge = getItemNameLabel(2, "Flat charge");
    private Label flatChargePrice = getItemTotalCostLabel(2, "Flat charge Total");
    private Label perTonneLabel = getItemNameLabel(3, "Per Tonne");
    private Label perTonnePrice = getItemTotalCostLabel(3, "Per Tonne Total");
    private Label itemLabel = getItemNameLabel(4, "Item");
    private Label itemPrice = getItemTotalCostLabel(4, "Item Total");

    private Label getItemNameLabel(int itemNumber, String elementName){
        return new Label(By.xpath(String.format("//tbody[contains(@class, 'gl-3')][%d]//td[contains(@class, 'cal fc')]", itemNumber)), elementName);
    }

    private Label getItemTotalCostLabel(int itemNumber, String elementName){
        return new Label(By.xpath(String.format("//tbody[contains(@class, 'gl-3')][%d]//td[contains(@class, 'car')][last()-1]", itemNumber)), elementName);
    }

    private Label getGradeWeightLabel(String className, String elementName){
        return new Label(By.xpath(String.format("//tbody[contains(@class, 'gl-2')][2]//td[contains(@class, '%s')]", className)), elementName);
    }
}
