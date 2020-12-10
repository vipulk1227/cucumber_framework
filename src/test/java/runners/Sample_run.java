package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Automation\\eclipse\\cucumber_framework\\src\\test\\resources\\Features",
glue="D:\\Automation\\eclipse\\cucumber_framework\\src\\test\\java\\stepdefinations",
monochrome=true,
plugin= {"pretty","html:target/HtmlReports"})
public class Sample_run {

}
