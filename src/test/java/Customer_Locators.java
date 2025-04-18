public class Customer_Locators {
    // Label xpath on Customer Details
    static String customer_details = "//a[normalize-space()='Customer Details']";
    static String billing_shipping = "//a[contains(text(),'Billing & Shipping')]";
    static String company = "//label[@for='company']";
    static String vat_number = "//label[@for='vat']";
    static String phone_number = "//label[@for='phonenumber']";
    static String website = "//label[@for='website']";
    static String group = "//label[@for='groups_in[]']";
    static String currency = "//label[@for='default_currency']";
    static String default_language = "//label[@for='default_language']";
    static String address = "//label[@for='address']";
    static String city1 = "//label[@for='city']";
    static String state1 = "//label[@for='state']";
    static String zipcode1 = "//label[@for='zip']";
    static String country1 = "//label[@for='country']";

    // Button xpath Save/Create contact and Submit on Customer Details
    static String save_createcontact1 = "//button[@class='btn btn-default save-and-add-contact customer-form-submiter']";
    static String save_customer_detail_form = "//button[@class='btn btn-primary only-save customer-form-submiter']";

    // Field input xpath on Customer Details
    static String input_company = "//input[@id='company']";
    static String input_vatnumber = "//input[@id='vat']";
    static String input_phonenumber = "//input[@id='phonenubmer']";
    static String input_webiste = "//input[@id='website']";
    static String select_group = "//div[contains(@class,'form-group-select-input-groups_in[]')]//div[text()='Nothing selected']";
    static String select_currency = "//div[@class='dropdown bootstrap-select bs3']//div[@class='filter-option-inner-inner'][normalize-space()='System Default']";
    static String select_language = "//div[@class='dropdown bootstrap-select form-control bs3']//div[@class='filter-option-inner-inner'][normalize-space()='System Default']";
    static String input_address = "address";
    static String input_city = "city";
    static String input_state = "state";
    static String input_zipcode = "zip";
    static String select_country = "//div[@class='dropdown bootstrap-select bs3 dropup']";

    // Xpath on Add new customer group
    static String add_new_customer_group = "//div[@class='input-group-btn']";
    static String name = "//label[@for='name']";
    static String input_name = "name";
    static String close = "//div[@class='modal-footer']/button[@group='button']";
    static String save_new_customer_group = "//div[@class='modal-footer']/button[@group='submit']";

    // Label xpath on Billing & Shipping
    // 1. Label xpath on Billing Address
    static String billing_address = "//h4[contains(text(),'Billing Address')]";
    static String street2 = "//label[@for='billing_street']";
    static String city2 = "//label[@for='billing_city']";
    static String state2 = "//label[@for='billing_state']";
    static String zipcode2 = "//label[@for='billing_zip']";
    static String country2 = "//label[@for='billing_country']";

    // Field input xpath on Billing Address
    static String input_street2  = "billing_street";
    static String input_city2 = "billing_city";
    static String input_state2 = "billing_state";
    static String input_zipcode2 = "billing_zip";
    static String select_country2 = "//button[@data-id='billing_country']";


    // 2. Label xpath on Shipping Address
    static String shipping_address = "//*[normalize-space()='Shipping Address']";
    static String street3 = "//label[@for='shipping_street']";
    static String city3 = "//label[@for='shipping_city']";
    static String state3 = "//label[@for='shipping_state']";
    static String zipcode3 = "//label[@for='shipping_zip']";
    static String country3 = "//label[@for='shipping_country']";

    // Field input xpath on Billing Address
    static String input_street3  = "shipping_street";
    static String input_city3 = "shipping_city";
    static String input_state3 = "shipping_state";
    static String input_zipcode3 = "shipping_zip";
    static String select_country3 = "//button[@data-id='shipping_country']";

    // Button xpath Save/Create contact and Submit on Billing/Shipping
    static String save_createcontact2 = "//button[@class='btn btn-default save-and-add-contact customer-form-submiter']";
    static String save_billing_shipping = "//button[@class='btn btn-primary only-save customer-form-submiter']";
}
