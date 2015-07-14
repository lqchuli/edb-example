package com.huobanplus.erpprovider.edb;

import event.ERPEvent;
import event.OrderEvent;
import handler.ERPHandler;
import handler.ERPHandlerBuilder;
import model.ERPInfo;
import model.EventResult;

import java.io.IOException;

/**
 * edb �����¼�����ʵ����
 * Created by allan on 2015/7/13.
 */
public class EDBHandlerBuilder implements ERPHandlerBuilder {

    /**
     * ����erp��Ϣ�ж��Ƿ��ɸ�erp-provider����
     *
     * @param erpInfo
     * @return �޷������ؿգ����Դ����ظ�erp�¼�������
     */
    public ERPHandler buildHandler(ERPInfo erpInfo) {
        if (erpInfo.toString().equals("")) {
            return null;
        }
        return new ERPHandler() {
            public boolean eventSupported(ERPEvent erpEvent) {
                //todo �ж��¼��Ƿ���Դ���
                if (erpEvent instanceof OrderEvent) {
                    return true;
                }
                return false;
            }

            public EventResult handleEvent(ERPEvent erpEvent) throws IOException, IllegalAccessException {
                //todo �����¼������ؽ��

                return null;
            }
        };
    }
}
