/*
 * This file is generated by jOOQ.
*/
package com.htl.domain.tables.daos;


import com.htl.domain.tables.SysMenu;
import com.htl.domain.tables.records.SysMenuRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SysMenuDao extends DAOImpl<SysMenuRecord, com.htl.domain.tables.pojos.SysMenu, String> implements VertxDAO<com.htl.domain.tables.records.SysMenuRecord,com.htl.domain.tables.pojos.SysMenu,java.lang.String> {

    /**
     * Create a new SysMenuDao without any configuration
     */
    public SysMenuDao() {
        super(SysMenu.SYS_MENU, com.htl.domain.tables.pojos.SysMenu.class);
    }

    /**
     * Create a new SysMenuDao with an attached configuration
     */
    public SysMenuDao(Configuration configuration) {
        super(SysMenu.SYS_MENU, com.htl.domain.tables.pojos.SysMenu.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(com.htl.domain.tables.pojos.SysMenu object) {
        return object.getPkId();
    }

    /**
     * Fetch records that have <code>PK_ID IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByPkId(String... values) {
        return fetch(SysMenu.SYS_MENU.PK_ID, values);
    }

    /**
     * Fetch a unique record that has <code>PK_ID = value</code>
     */
    public com.htl.domain.tables.pojos.SysMenu fetchOneByPkId(String value) {
        return fetchOne(SysMenu.SYS_MENU.PK_ID, value);
    }

    /**
     * Fetch records that have <code>T_SCRIPT IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByTScript(String... values) {
        return fetch(SysMenu.SYS_MENU.T_SCRIPT, values);
    }

    /**
     * Fetch records that have <code>V_APP_ID IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByVAppId(String... values) {
        return fetch(SysMenu.SYS_MENU.V_APP_ID, values);
    }

    /**
     * Fetch records that have <code>V_RES_ID IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByVResId(String... values) {
        return fetch(SysMenu.SYS_MENU.V_RES_ID, values);
    }

    /**
     * Fetch records that have <code>S_NAME IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchBySName(String... values) {
        return fetch(SysMenu.SYS_MENU.S_NAME, values);
    }

    /**
     * Fetch records that have <code>S_CODE IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchBySCode(String... values) {
        return fetch(SysMenu.SYS_MENU.S_CODE, values);
    }

    /**
     * Fetch records that have <code>S_ICON IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchBySIcon(String... values) {
        return fetch(SysMenu.SYS_MENU.S_ICON, values);
    }

    /**
     * Fetch records that have <code>S_TEXT IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchBySText(String... values) {
        return fetch(SysMenu.SYS_MENU.S_TEXT, values);
    }

    /**
     * Fetch records that have <code>S_TYPE IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchBySType(String... values) {
        return fetch(SysMenu.SYS_MENU.S_TYPE, values);
    }

    /**
     * Fetch records that have <code>S_URI IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchBySUri(String... values) {
        return fetch(SysMenu.SYS_MENU.S_URI, values);
    }

    /**
     * Fetch records that have <code>J_CONFIG IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByJConfig(String... values) {
        return fetch(SysMenu.SYS_MENU.J_CONFIG, values);
    }

    /**
     * Fetch records that have <code>I_LEFT IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByILeft(Long... values) {
        return fetch(SysMenu.SYS_MENU.I_LEFT, values);
    }

    /**
     * Fetch records that have <code>I_LEVEL IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByILevel(Integer... values) {
        return fetch(SysMenu.SYS_MENU.I_LEVEL, values);
    }

    /**
     * Fetch records that have <code>I_RIGHT IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByIRight(Long... values) {
        return fetch(SysMenu.SYS_MENU.I_RIGHT, values);
    }

    /**
     * Fetch records that have <code>R_PARENT_ID IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByRParentId(String... values) {
        return fetch(SysMenu.SYS_MENU.R_PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>IS_ACTIVE IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByIsActive(Boolean... values) {
        return fetch(SysMenu.SYS_MENU.IS_ACTIVE, values);
    }

    /**
     * Fetch records that have <code>Z_SIGMA IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByZSigma(String... values) {
        return fetch(SysMenu.SYS_MENU.Z_SIGMA, values);
    }

    /**
     * Fetch records that have <code>Z_LANGUAGE IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByZLanguage(String... values) {
        return fetch(SysMenu.SYS_MENU.Z_LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_BY IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByZCreateBy(String... values) {
        return fetch(SysMenu.SYS_MENU.Z_CREATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_TIME IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByZCreateTime(LocalDateTime... values) {
        return fetch(SysMenu.SYS_MENU.Z_CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_BY IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByZUpdateBy(String... values) {
        return fetch(SysMenu.SYS_MENU.Z_UPDATE_BY, values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_TIME IN (values)</code>
     */
    public List<com.htl.domain.tables.pojos.SysMenu> fetchByZUpdateTime(LocalDateTime... values) {
        return fetch(SysMenu.SYS_MENU.Z_UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>PK_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByPkIdAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.PK_ID,values);
    }

    /**
     * Fetch a unique record that has <code>PK_ID = value</code> asynchronously
     */
    public CompletableFuture<com.htl.domain.tables.pojos.SysMenu> fetchOneByPkIdAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByPkId(value)),vertx());
    }

    /**
     * Fetch records that have <code>T_SCRIPT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByTScriptAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.T_SCRIPT,values);
    }

    /**
     * Fetch records that have <code>V_APP_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByVAppIdAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.V_APP_ID,values);
    }

    /**
     * Fetch records that have <code>V_RES_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByVResIdAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.V_RES_ID,values);
    }

    /**
     * Fetch records that have <code>S_NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchBySNameAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.S_NAME,values);
    }

    /**
     * Fetch records that have <code>S_CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchBySCodeAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.S_CODE,values);
    }

    /**
     * Fetch records that have <code>S_ICON IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchBySIconAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.S_ICON,values);
    }

    /**
     * Fetch records that have <code>S_TEXT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchBySTextAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.S_TEXT,values);
    }

    /**
     * Fetch records that have <code>S_TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchBySTypeAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.S_TYPE,values);
    }

    /**
     * Fetch records that have <code>S_URI IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchBySUriAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.S_URI,values);
    }

    /**
     * Fetch records that have <code>J_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByJConfigAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.J_CONFIG,values);
    }

    /**
     * Fetch records that have <code>I_LEFT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByILeftAsync(List<Long> values) {
        return fetchAsync(SysMenu.SYS_MENU.I_LEFT,values);
    }

    /**
     * Fetch records that have <code>I_LEVEL IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByILevelAsync(List<Integer> values) {
        return fetchAsync(SysMenu.SYS_MENU.I_LEVEL,values);
    }

    /**
     * Fetch records that have <code>I_RIGHT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByIRightAsync(List<Long> values) {
        return fetchAsync(SysMenu.SYS_MENU.I_RIGHT,values);
    }

    /**
     * Fetch records that have <code>R_PARENT_ID IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByRParentIdAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.R_PARENT_ID,values);
    }

    /**
     * Fetch records that have <code>IS_ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByIsActiveAsync(List<Boolean> values) {
        return fetchAsync(SysMenu.SYS_MENU.IS_ACTIVE,values);
    }

    /**
     * Fetch records that have <code>Z_SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByZSigmaAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.Z_SIGMA,values);
    }

    /**
     * Fetch records that have <code>Z_LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByZLanguageAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.Z_LANGUAGE,values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByZCreateByAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.Z_CREATE_BY,values);
    }

    /**
     * Fetch records that have <code>Z_CREATE_TIME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByZCreateTimeAsync(List<LocalDateTime> values) {
        return fetchAsync(SysMenu.SYS_MENU.Z_CREATE_TIME,values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByZUpdateByAsync(List<String> values) {
        return fetchAsync(SysMenu.SYS_MENU.Z_UPDATE_BY,values);
    }

    /**
     * Fetch records that have <code>Z_UPDATE_TIME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<com.htl.domain.tables.pojos.SysMenu>> fetchByZUpdateTimeAsync(List<LocalDateTime> values) {
        return fetchAsync(SysMenu.SYS_MENU.Z_UPDATE_TIME,values);
    }

    private io.vertx.core.Vertx vertx;

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}
