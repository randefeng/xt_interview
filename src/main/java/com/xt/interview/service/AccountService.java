package com.xt.interview.service;

import com.xt.interview.dto.AccountDTO;
import com.xt.interview.dto.PageResult;

import java.util.List;

public interface AccountService {

    AccountDTO createAccount(AccountDTO dto);

    AccountDTO updateAccount(Long id, AccountDTO dto);

    void deleteAccount(Long id);

    AccountDTO getAccountById(Long id);

    List<AccountDTO> getAllAccounts();

    /**
     * 分页查询用户：支持用户名模糊搜索、状态、权限级别筛选
     */
    PageResult<AccountDTO> getAccountPage(String username, Integer status, Integer roleLevel, int page, int size);

    AccountDTO login(String username, String password);
}
