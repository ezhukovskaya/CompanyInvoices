package tests;

import application.constants.CompanyInfoConstants;
import application.constants.PricesConstants;
import application.pages.CompanyInvoicesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompanyInvoicesTest extends BaseTest{
    @Test
    public static void matchingInfoTest() {
        CompanyInvoicesPage companyInvoicesPage = new CompanyInvoicesPage();
        Assert.assertEquals(CompanyInfoConstants.EXPECTED_COMPANY, companyInvoicesPage.getCompanyNameLabel().getText(), "Company name does not match");
        Assert.assertEquals(CompanyInfoConstants.INVOICE_ADDRESS, companyInvoicesPage.getInvoiceAddressLabel().getText(), "Invoice address does not match");
        Assert.assertEquals(CompanyInfoConstants.GRADE, companyInvoicesPage.getGrade().getText(), "Grade does not match");
        Assert.assertEquals(CompanyInfoConstants.WEIGHT, companyInvoicesPage.getWeight().getText(), "Weight does not match");
        Assert.assertEquals(PricesConstants.FLAT_CHARGE, companyInvoicesPage.getFlatCharge().getText(), "Price entity does not match");
        Assert.assertEquals(PricesConstants.PER_TONNE, companyInvoicesPage.getPerTonneLabel().getText(), "Price entity does not match");
        Assert.assertEquals(PricesConstants.ITEM, companyInvoicesPage.getItemLabel().getText(), "Price entity does not match");
        Assert.assertEquals(PricesConstants.FLAT_CHARGE_PRICE, companyInvoicesPage.getFlatChargePrice().getText(), "Total Cost does not match");
        Assert.assertEquals(PricesConstants.PER_TONNE_PRICE, companyInvoicesPage.getPerTonnePrice().getText(), "Total Cost does not match");
        Assert.assertEquals(PricesConstants.ITEM_PRICE, companyInvoicesPage.getItemPrice().getText(), "Total Cost does not match");
    }
}
