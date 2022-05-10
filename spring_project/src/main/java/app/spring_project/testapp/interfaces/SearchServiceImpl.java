package app.spring_project.testapp.interfaces;

import java.util.List;

import app.spring_project.testapp.accessors.UserInfo;

public interface SearchServiceImpl {
    List<UserInfo> callService();
}
