package tasks;

import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.uTestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

    private String first_Name;
    private String last_Name;
    private String email_Address;
    private String month_Birth;
    private String day_Birth;
    private String year_Birth;
    private String city_City;
    private String postal_Code;
    private String create_Password;
    private String confirm_Password;

    public Register(String first_Name, String last_Name, String email_Address, String month_Birth, String day_Birth, String year_Birth, String city_City, String postal_Code, String create_Password, String confirm_Password) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.email_Address = email_Address;
        this.month_Birth = month_Birth;
        this.day_Birth = day_Birth;
        this.year_Birth = year_Birth;
        this.city_City = city_City;
        this.postal_Code = postal_Code;
        this.create_Password = create_Password;
        this.confirm_Password = confirm_Password;
    }


    public static Register OnThePage(String first_Name, String last_Name, String email_Address, String month_Birth, String day_Birth, String year_Birth, String city_City, String postal_Code, String create_Password, String confirm_Password) {
        return Tasks.instrumented(Register.class, first_Name, last_Name, email_Address, month_Birth, day_Birth, year_Birth, city_City, postal_Code, create_Password, confirm_Password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue((first_Name)).into(uTestRegister.Input_Firts_Name),
            Enter.theValue((last_Name)).into(uTestRegister.Input_Last_Name),
            Enter.theValue((email_Address)).into(uTestRegister.Input_Email),
            SelectFromOptions.byVisibleText((month_Birth)).from(uTestRegister.Input_Mont),
            SelectFromOptions.byVisibleText((day_Birth)).from(uTestRegister.Input_Day),
            SelectFromOptions.byVisibleText((year_Birth)).from(uTestRegister.Input_Year),
            Click.on(uTestRegister.Next_Button),
            Enter.theValue((city_City)).into(uTestRegister.City),
            Enter.theValue((postal_Code)).into(uTestRegister.Zip),
            Click.on(uTestRegister.Next_Button_Devices),
            Click.on(uTestRegister.Button_Next_Last),
            Enter.theValue((create_Password)).into(uTestRegister.Password),
            Enter.theValue((confirm_Password)).into(uTestRegister.Confirm_Password),
            Click.on(uTestRegister.Informed),
            Click.on(uTestRegister.Terms),
            Click.on(uTestRegister.Privacy),
            Click.on(uTestRegister.Button_Complete)
        );
    }
}
