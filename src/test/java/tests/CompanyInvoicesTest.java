package tests;

import application.constants.CompanyInfoConstants;
import application.constants.UrlConstants;
import application.pages.CompanyInvoicesPage;
import framework.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyInvoicesTest {
    @Test
    public static void matchingInfoTest(){
        Browser.setImplicitlyWait();
        Browser.goToUrl(UrlConstants.WEB_URL);
        Browser.maximize();
        CompanyInvoicesPage companyInvoicesPage = new CompanyInvoicesPage();
        Assert.assertEquals(CompanyInfoConstants.EXPECTED_COMPANY, companyInvoicesPage.getCompanyNameLabel().getText(), "Company name does not match");
        Assert.assertEquals(CompanyInfoConstants.INVOICE_ADDRESS, companyInvoicesPage.getInvoiceAddressLabel().getText(), "Invoice address does not match");
        Assert.assertEquals(CompanyInfoConstants.GRADE, companyInvoicesPage.getGrade().getText(), "Grade does not match");
        Assert.assertEquals(CompanyInfoConstants.WEIGHT, companyInvoicesPage.getWeight().getText(), "Weight does not match");
        Assert.assertEquals(CompanyInfoConstants.FLAT_CHARGE, companyInvoicesPage.getFlatCharge().getText(), "Price entity does not match");
        Assert.assertEquals(CompanyInfoConstants.PER_TONNE, companyInvoicesPage.getPerTonneLabel().getText(), "Price entity does not match");
        Assert.assertEquals(CompanyInfoConstants.ITEM, companyInvoicesPage.getItemLabel().getText(), "Price entity does not match");
        Assert.assertEquals(CompanyInfoConstants.FLAT_CHARGE_TOTAL, companyInvoicesPage.getFlatChargePrice().getText(), "Total Cost does not match");
        Assert.assertEquals(CompanyInfoConstants.PER_TONNE_TOTAL, companyInvoicesPage.getPerTonnePrice().getText(), "Total Cost does not match");
        Assert.assertEquals(CompanyInfoConstants.ITEM_TOTAL, companyInvoicesPage.getItemPrice().getText(), "Total Cost does not match");
        Browser.quit();
    }
}
