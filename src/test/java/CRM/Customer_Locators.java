package CRM;

public class Customer_Locators {
    // Xpath for Customers menu
    static String menuCustomer = "//span[normalize-space()='Customers']";
    // Xpath for New Customer button
    static String buttonNewCustomer = "//a[normalize-space()='New Customer']";
    // Xpath for Contacs button
    static String buttonContacts = "//a[normalize-space()='Contacts' and contains(@href,'all_contacts')]";
    // Xpath for Search input
    static String inputSearch = "//div[@id='clients_filter']//input[@type='search']";

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

    // Button xpath Save/Create contact and Submit
    static String buttonSaveCreateContact = "//div[@id='profile-save-section']/button[normalize-space() = 'Save and create contact']";
    static String buttonSave = "//div[@id='profile-save-section']//button[normalize-space() = 'Save']";

    // Field input xpath on Customer Details
    static String input_company = "//input[@id='company']";
    static String input_vatnumber = "//input[@id='vat']";
    static String input_phonenumber = "//input[@id='phonenubmer']";
    static String input_webiste = "//input[@id='website']";
    static String dropdown_group = "//button[@data-id='groups_in[]']";
    static String input_searchgroup = "//select[@id='groups_in[]']/following-sibling::div//input[@type='search']";
    static String dropdown_currency = "//button[@data-id='default_currency']";
    static String input_searchcurrency = "//select[@id='default_currency']/following-sibling::div//input[@type='search']";
    static String dropdown_language = "//button[@data-id='default_language']";
    static String input_address = "address";
    static String input_city = "city";
    static String input_state = "state";
    static String input_zipcode = "zip";
    static String select_country = "//button[@data-id='country']";

    // Xpath on Add new customer group
    static String add_new_customer_group = "//div[@class='input-group-btn']";
    static String name = "//label[@for='name']";
    static String input_name = "name";
    static String close = "//form[@id='customer-group-modal']//button[text() = 'Close']";
    static String save_new_customer_group = "//form[@id='customer-group-modal']//button[text() = 'Save']";

    // Label xpath on Billing & Shipping
    // 1. Label xpath on Billing Address
    static String billing_address = "//h4[contains(text(),'Billing Address')]";
    static String street2 = "//label[@for='billing_street']";
    static String city2 = "//label[@for='billing_city']";
    static String state2 = "//label[@for='billing_state']";
    static String zipcode2 = "//label[@for='billing_zip']";
    static String country2 = "//label[@for='billing_country']";

    // Field input xpath on Billing Address
    static String input_street2 = "billing_street";
    static String input_city2 = "billing_city";
    static String input_state2 = "billing_state";
    static String input_zipcode2 = "billing_zip";
    static String dropdown_country2 = "//button[@data-id='billing_country']";


    // 2. Label xpath on Shipping Address
    static String shipping_address = "//*[normalize-space()='Shipping Address']";
    static String street3 = "//label[@for='shipping_street']";
    static String city3 = "//label[@for='shipping_city']";
    static String state3 = "//label[@for='shipping_state']";
    static String zipcode3 = "//label[@for='shipping_zip']";
    static String country3 = "//label[@for='shipping_country']";

    // Field input xpath on Shipping Address
    static String input_street3 = "shipping_street";
    static String input_city3 = "shipping_city";
    static String input_state3 = "shipping_state";
    static String input_zipcode3 = "shipping_zip";
    static String dropdown_country3 = "//button[@data-id='shipping_country']";

}
