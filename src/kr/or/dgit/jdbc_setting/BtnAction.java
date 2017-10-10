package kr.or.dgit.jdbc_setting;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import kr.or.dgit.jdbc_setting.service.DbService;
import kr.or.dgit.jdbc_setting.service.ExportService;
import kr.or.dgit.jdbc_setting.service.ImportService;
import kr.or.dgit.jdbc_setting.service.InitService;

@SuppressWarnings("serial")
public class BtnAction extends AbstractAction {
	
	public BtnAction(String name){
		super(name);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		DbService serivce =null;
		//초기화, 백업, 복원
		switch(e.getActionCommand()){
		case "초기화":
			serivce = InitService.getInstance();
			break;
		case "백업":
			serivce = ImportService.getInstance();
			break;
		case "복원":
			serivce = ExportService.getInstance();
			break;
		}
		serivce.service();
		JOptionPane.showMessageDialog(null, e.getActionCommand() + " 가 (이) 완료 되었습니다.");
	}

}
