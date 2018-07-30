package org.kjtc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Controller
@RequestMapping(value = "/fileDownload")
public class fileDownloadController {
    /**
     * 文件下载公用类
     * @param f_name
     * @param f_path
     * @return
     * @throws Exception
     */

    @RequestMapping(value = "/logFileDownLoad",method = RequestMethod.GET)
    public ResponseEntity<byte[]> fileDownLoad(String f_name,String f_path) throws Exception {
        String realPath = f_path+f_name;
        InputStream in = new FileInputStream(new File(realPath));
        byte[] body = new byte[in.available()];
        in.read(body);
      //  String fileName = new String(realPath.substring(realPath.length() - new StringBuilder(realPath).reverse().toString().indexOf("/"), realPath.length()).getBytes("gbk"), "iso8859-1");
        String fileName = f_name;

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=" + fileName);
        HttpStatus statusCode = HttpStatus.OK;
        return new ResponseEntity<byte[]>(body, headers, statusCode);
    }

    /**
     *
     * @param f_name
     * @param f_path
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/fileDownLoadByPath",method = RequestMethod.GET)

    public ResponseEntity<byte[]> fileDownLoadByPath(String f_name, String f_path) throws Exception {
        String realPath = f_path;
        InputStream in = new FileInputStream(new File(realPath));
        byte[] body = new byte[in.available()];
        in.read(body);
        //  String fileName = new String(realPath.substring(realPath.length() - new StringBuilder(realPath).reverse().toString().indexOf("/"), realPath.length()).getBytes("gbk"), "iso8859-1");
        String fileName = f_name;

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=" + fileName);
        HttpStatus statusCode = HttpStatus.OK;
        return new ResponseEntity<byte[]>(body, headers, statusCode);
    }



}
