package CRM;

public class Project_Locators {
    // Xpath for Projects menu
    static String menuProject = "//span[normalize-space()='Projects']";
    // Xpath for New Project button
    static String buttonNewProject = "//a[normalize-space()='New Project']";
    // Xpath for Projects form
    static String inputProjectName = "name";
    static String dropdownCustomer = "//button[@data-id='clientid']";
    static String inputSearchCustomer = "//button[@data-id='clientid']/following-sibling::div//input[@type='search']";
    static String checkboxCalculateProgress = "//input[@id='progress_from_tasks']";
    static String slidebarProgress = "//div[@id='tab_project']/descendant::div[contains(@class,'project_progress_slider')]";
    static String dropdownBillingType = "//button[@data-id='billing_type']";
    static String dropdownlistBillingType = "//button[@data-id='billing_type']/following-sibling::div//li";
    static String dropdownStatus = "//button[@data-id='status']";
    static String dropdownlistStatus = "//button[@data-id='status']/following-sibling::div//li";
    static String inputRatePerHour = "//input[@id='project_rate_per_hour']";
    static String inputEstimateHour = "//input[@id='estimated_hours']";
    static String dropdownMembers = "//button[@data-id='project_members[]']";
    static String inputSearchMember = "//button[@data-id='project_members[]']/following-sibling::div//input[@type='search']";
    static String inputStartDate = "//input[@id='start_date']";
    static String selectStartDate = "//input[@id='start_date']/following-sibling::div//i[contains(@class,'calendar-icon')]";
    static String inputDeadline = "//input[@id='deadline']";
    static String selectDeadline = "//input[@id='deadline']/following-sibling::div/i[contains(@class,'calendar-icon')]";
    static String buttonSave = "//button[normalize-space()='Save']";

    // Xpath for Rich Text Editor
    static String buttonFile = "//span[text()='File']";
    static String buttonEdit = "//span[text()='Edit']";
    static String buttonView = "/span[text()='View']";
    static String buttonInsert = "/span[text()='Insert']";
    static String buttonFormat = "/span[text()='Format']";
    static String buttonTools = "/span[text()='Tools']";
    static String buttonTable = "/span[text()='Table']";
    static String dropdownFont = "//button[@title='Font System Font']";
    static String dropdownlistFont = "//button[@title='Font System Font']/following::div[contains(@class,'item-label')]";
    static String dropdownFontSize  = "//button[contains(@title,'Font size')]";
    static String dropdownlistFontSize = "//button[contains(@title,'Font size')]/following::div[contains(@class,'item-label')]";

    static String buttonBold = "//button[@title='Bold']";
    static String buttonItalic = "//button[@title='Italic']";
    static String buttonAlignLeft = "//button[@title='Align left']";
    static String buttonAlignCenter = "//button[@title='Align center']";
    static String buttonAlignRight = "//button[@title='Align right']";
    static String buttonAlignJustify = "//button[@title='Justify']";
    static String buttonInsertIMG = "//button[@title='Insert/edit image']";
    static String buttonInsertLink = "//button[@title='Insert/edit link']";
    static String buttonBulletList = "//div[@title='Bullet list']";
    static String buttonNumberList = "//div[@title='Numbered list']";
    static String buttonRestore = "//button[@title='Restore last draft']";






}
