package com.wf.ew.system.service;

import com.wf.ew.system.model.Authorities;

import java.util.List;

public interface AuthoritiesService {

    List<Authorities> listByUserId(String userId);

    List<Authorities> list();

    List<Authorities> listByRoleIds(List<String> roleId);

    List<Authorities> listByRoleId(String roleId);

    boolean add(Authorities authorities);

    boolean update(Authorities authorities);

    boolean delete(String authorityId);

    boolean addRoleAuth(String roleId, String authId);

    boolean deleteRoleAuth(String roleId, String authId);
}
