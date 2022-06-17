public class super{
private WebElement username;
private WebElement password;

public WebElement getusername(){
return username;
}

public WebElement getpassword(){
return password;
}

public void super(){
pageFactory.initElements(driver,this)
}
