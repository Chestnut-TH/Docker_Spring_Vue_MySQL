package app.spring_project.testapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import app.spring_project.testapp.accessors.UserInfo;

@Mapper
public interface SearchMapper {
    List<UserInfo> selectUser();
}
