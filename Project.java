package Java8;

import java.util.List;

class Project {

String projectName;

List<String> technologies; // e.g. ["Java", "Spring", "AWS"]*

public String getProjectName() {
	return projectName;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

public List<String> getTechnologies() {
	return technologies;
}

public void setTechnologies(List<String> technologies) {
	this.technologies = technologies;
}

// constructor, getters*

}