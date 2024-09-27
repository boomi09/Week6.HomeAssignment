package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//CucumberOptions will allow only String Single Array attribute
//features attribute should contain path of feature file
//glue attribute should contain package name StepDefinition
//default publish attribute valuse is false,if we set as true it will create report
//default monochrome attribute value is false,if we set as true it will show clear error logs

@CucumberOptions(features= {"src/test/java/FeatureFiles/SalesForceAccountDynamic.feature"},
glue= {"StepDefinitionHA"},
publish=true,
monochrome=true)
public class CucumberRunner extends AbstractTestNGCucumberTests {



}