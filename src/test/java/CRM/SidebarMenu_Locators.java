package CRM;

public class SidebarMenu_Locators {
    // Xpath for Sidebar Menu
    static String menuDashboard = "//span[normalize-space()='Dashboard']";
    static String menuCustomers = "//span[normalize-space()='Customers']";
    static String menuSales = "//li[@class='menu-item-sales']//span[normalize-space()='Sales']";
    static String menuSubscriptions = "//span[normalize-space()='Subscriptions']";
    static String menuExpenses = "//li[@class='menu-item-expenses']//span[normalize-space() = 'Expenses']";
    static String menuContracts = "//span[normalize-space() = 'Contracts']";
    static String menuProjects = "/span[normalize-space()='Projects']";
    static String menuTask = "/span[normalize-space()='Tasks']";
    static String menuSupport = "//span[normalize-space() = 'Support']";
    static String menuLeads = "//li[@class='menu-item-leads']//span[normalize-space()='Leads']";
    static String menuEstimateRequest = "//span[normalize-space()='Estimate Request']";
    static String menuKnowledgeBase = "//span[normalize-space()='Knowledge Base']";
    static String menuUtility = "//span[normalize-space()='Utilities']";
    static String menuReport = "//span[normalize-space()='Reports']";

    // Xpath for subMenu Sales
    static String submenuProposals = "//span[normalize-space()='Proposals']";
    static String submenuEstimates = "//span[normalize-space()='Estimates']";
    static String submenuInvoices = "//span[normalize-space()='Invoices']";
    static String submenuPayments = "//span[normalize-space()='Payments']";
    static String submenuCreditNotes = "//span[normalize-space()='Credit Notes']";
    static String submenuItems = "//span[normalize-space()='Items']";

    // Xpath for subMenu Utilities
    static String submenuMedia = "//span[normalize-space()='Media']";
    static String submenuPDFExport = "//span[contains(normalize-space(),'PDF')]";
    static String submenuCalendar = "//span[normalize-space()='Calendar']";

    // Xpath for List Menu Sidebar
    static String listmenu = "//ul[@id='side-menu']/li[starts-with(@class,'menu-item')]";

    // Xpath for List SubMenu Sales
    static String listsubmenuSales = "//li[starts-with(@class,'menu-item-sales')]//li";


}
