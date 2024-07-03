### Title:
Add Javadoc comments to Calculator class and its methods

### Description:
### Changes:
- Added Javadoc comments to the `Calculator` class.
- Documented the methods `add`, `subtract`, `multiply`, `divide`, and `factorial` with `@param`, `@return`, and `@throws` annotations.

### Reasons:
- Improved code documentation to increase understandability and maintainability.
- Provided detailed information on how each method works and the expected parameters and return values.
- Assisted other developers who want to use or further develop this class.

### Details:
- Each method now has a description explaining its purpose and functionality.
- Parameter names and types are documented.
- Return values are documented.
- Error scenarios (e.g., division by zero in the `divide` method) are documented.
## Maven Site Configuration

-  Documentation of configurations and steps for generating Maven Site.

#### What is necessary to generate Maven Site Documentation?

To generate Maven Site documentation, the following steps are essential:
1. Ensure that your `pom.xml` includes plugins for compiling code, running tests, and generating reports.
2. Add the `maven-javadoc-plugin` and `maven-surefire-report-plugin` in the `<reporting>` section of your `pom.xml`.
3. Include project information such as the URL for site distribution and developer details.

### Configurations in `site.xml` and `pom.xml`

- **`pom.xml` Configurations**:
    - **Dependencies**: Add dependencies for JUnit and Log4j for testing and logging purposes.
    - **Build Plugins**: Configure plugins for compiling code (`maven-compiler-plugin`), generating the site (`maven-site-plugin`), and executing the main class (`exec-maven-plugin`).
    - **Reporting Plugins**: Include the `maven-javadoc-plugin` and `maven-surefire-report-plugin` to generate Javadoc and test reports.
    - **Distribution Management**: Set the URL for the site in the `<distributionManagement>` section.
    - **Developers**: Add developer information in the `<developers>` section.

- **`site.xml` Configurations**:
    - Generally includes the structure and decoration of the site. However, for simple projects, this file can be omitted if the default settings are sufficient.

