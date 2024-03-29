package com.github.houbb.compress.context;

import java.nio.file.Path;
import java.util.List;

/**
 * 上下文接口
 * @author binbin.hou
 * @since 0.0.1
 */
public interface ICompressContext {

    /**
     * 原始文件 path 列表
     * @return path 列表
     */
    List<Path> sourcePaths();

    /**
     * 获取第一个原始文件 path
     * @return path 文件信息
     */
    Path sourcePathFirst();

    /**
     * 目标文件路径
     * @return 目标文件
     */
    Path targetPath();

    /**
     * 密码
     * @return 加密信息
     */
    String password();

    /**
     * 归档是否使用相对路径
     * 1. 默认使用相对位置作为 entry 的名称。
     * 2. 解压归档的时候注意：要创建对应的文件路径信息。
     * @return 是否
     */
    boolean isRelativePath();

}
