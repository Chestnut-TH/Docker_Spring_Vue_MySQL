package app.spring_project.testapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.spring_project.testapp.accessors.UserInfo;
import app.spring_project.testapp.interfaces.SearchServiceImpl;
import app.spring_project.testapp.mapper.SearchMapper;

@Service
public class SearchService implements SearchServiceImpl{
    @Autowired
    SearchMapper mapper;
    @Override
    public List<UserInfo> callService() {
        return mapper.selectUser();
    }
}
