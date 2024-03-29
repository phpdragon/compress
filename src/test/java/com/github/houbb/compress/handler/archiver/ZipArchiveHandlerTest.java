package com.github.houbb.compress.handler.archiver;

import com.github.houbb.compress.context.impl.DefaultCompressContext;
import com.github.houbb.compress.handler.ArchiveHandler;
import com.github.houbb.compress.handler.UnArchiveHandler;
import com.github.houbb.compress.handler.archive.ZipArchiveHandler;
import com.github.houbb.compress.handler.archive.ZipUnArchiveHandler;
import org.junit.Ignore;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author binbin.hou
 * @since 0.0.1
 */
@Ignore
public class ZipArchiveHandlerTest {

    /**
     * 解档压缩文件
     */
    @Test
    public void unArchiveTest() {
        final String zipPath = "C:\\Users\\binbin.hou\\Desktop\\1.zip";
        final String targetPath = "C:\\Users\\binbin.hou\\Desktop\\zip\\";

        UnArchiveHandler handler = new ZipUnArchiveHandler();

        DefaultCompressContext handlerContext = new DefaultCompressContext();
        handlerContext.sourcePaths(Arrays.asList(Paths.get(zipPath)));
        handlerContext.targetPath(Paths.get(targetPath));
        handler.handle(handlerContext);
    }

    /**
     * 使用相对路径归档文件
     */
    @Test
    public void archiveDirRelativePathTest() {
        final String sourceDir = "C:\\Users\\binbin.hou\\Desktop\\zip\\";
        final String targetPath = "C:\\Users\\binbin.hou\\Desktop\\zip\\1.zip";

        ArchiveHandler archiveHandler = new ZipArchiveHandler();

        DefaultCompressContext handlerContext = new DefaultCompressContext();
        handlerContext.sourcePaths(Arrays.asList(Paths.get(sourceDir)));
        handlerContext.targetPath(Paths.get(targetPath));
        handlerContext.isRelativePath(true);

        archiveHandler.handle(handlerContext);
    }

}
