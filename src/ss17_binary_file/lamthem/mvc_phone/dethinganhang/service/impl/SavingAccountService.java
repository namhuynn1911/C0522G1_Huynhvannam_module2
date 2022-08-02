package ss17_binary_file.lamthem.mvc_phone.dethinganhang.service.impl;

import ss17_binary_file.lamthem.mvc_phone.dethinganhang.exception.NotFountBankAccountException;
import ss17_binary_file.lamthem.mvc_phone.dethinganhang.exception.PositiveNumberException;
import ss17_binary_file.lamthem.mvc_phone.dethinganhang.model.Bank;
import ss17_binary_file.lamthem.mvc_phone.dethinganhang.model.SavingAccount;
import ss17_binary_file.lamthem.mvc_phone.dethinganhang.service.ISavingAccountService;
import ss17_binary_file.lamthem.mvc_phone.dethinganhang.utils.FormatName;
import ss17_binary_file.lamthem.mvc_phone.dethinganhang.utils.ReaWriteBankAccount;

import java.util.List;
import java.util.Scanner;

public class SavingAccountService implements ISavingAccountService {
    private static final String PATH = "src/dethinganhang/data/savingAccount.csv";
    private static final Scanner SCANNER = new Scanner(System.in);

    @Override
    public void add() {
        List<Bank> savingAccountList = ReaWriteBankAccount.readBank(PATH);

        int id = savingAccountList.get(savingAccountList.size() - 1).getId() + 1;

        String accountCode = setAccountCode();

        System.out.println("nhập vào chủ tên tài khoản:");
        String nameBank = SCANNER.nextLine();
        String name = FormatName.getName(nameBank);

        String bankCreationDate = setBankCreationDate();

        int deposits;
        while (true) {
            try {
                System.out.println("nhập vào số tiền tieetss kiệm:");
                deposits = Integer.parseInt(SCANNER.nextLine());
                if (deposits < 0) {
                    throw new PositiveNumberException("số tiền tiết kiệm phải lớn hơn khôgn");
                }
                break;
            } catch (PositiveNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        String depositDate;
        while (true) {
            System.out.println("nhập vào ngày gởi tiết kiệm:");
            depositDate = SCANNER.nextLine();
            if (depositDate.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19\\d{2}|20[01]\\d)")) {
                break;
            } else {
                System.out.println("bạn nhập sai định dạng ngày sinh,dd/mm/yyyy .dd là ngày/mm là tháng/yyyy là năm");
            }
        }

        String interest = setInterest();

        String tenor;
        while (true) {
            System.out.println("nhập vào kì hạng tài khoản tiết kiệm:");
            tenor = SCANNER.nextLine();
            if (tenor.matches("tháng|năm")) {
                break;
            } else {
                System.out.println("bạn nhập sai kì hạng.chỉ có kì hạng tháng hoặc năm");
            }
        }
        savingAccountList.add(new SavingAccount(id, accountCode, name, bankCreationDate, deposits, depositDate, interest,
                tenor));
        ReaWriteBankAccount.writeBankFile(PATH, savingAccountList);
        System.out.println("Thêm mới thành công");

    }

    @Override
    public void display() {
        List<Bank> savingAccountList = ReaWriteBankAccount.readBank(PATH);
        for (Bank savingAccount : savingAccountList) {
            System.out.println(savingAccount);
        }
    }

    @Override
    public void remove() {
        List<Bank> savingAaccountList = ReaWriteBankAccount.readBank(PATH);
        for (Bank savingAccount : savingAaccountList) {
            System.out.println(savingAccount);
        }
        String accountCode;
        boolean flag = false;
        do {
            System.out.println("bạn nhập mã ngân hàng cần xóa:");
            accountCode = SCANNER.nextLine();
            for (Bank savingAccount : savingAaccountList) {
                if (savingAccount.getAccountCode().equals(accountCode)) {
                    System.out.println("Bạn có chắc chắn muốn xóa không:\n" +
                            "1. Có\n" +
                            "2. Không");
                    int chooseYesNo = Integer.parseInt(SCANNER.nextLine());
                    if (chooseYesNo == 1) {
                        savingAaccountList.remove(savingAccount);
                        ReaWriteBankAccount.writeBankFile(PATH, savingAaccountList);
                        System.out.println("xóa thành công");
                    }
                    flag = true;
                    break;
                }
            }
            try {
                if (!flag) {
                    throw new NotFountBankAccountException("mã tài khoản không tồn tại");
                }
            } catch (NotFountBankAccountException e) {
                System.out.println(e.getMessage());
            }
        } while (!flag);

    }

    @Override
    public void find() {

    }
    public String setInterest() {
        System.out.println("Phần trăm lãi xuất\n" +
                "1. Lãi xuất 10%\n" +
                "2. Lãi xuất 15%");
        int choose = 0;
        do {
            try {
                choose = Integer.parseInt(SCANNER.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            switch (choose) {
                case 1:
                    return "10%";
                case 2:
                    return "15%";
                default:
                    System.out.println("bạn nên nhập lại");
            }
        } while (true);
    }


    public String setAccountCode() {
        String accountCode;
        while (true) {
            System.out.println("nhập vào mã ngân hàng");
            accountCode = SCANNER.nextLine();
            if (accountCode.matches("\\d{10}")) {
                break;
            } else {
                System.out.println("bạn nhập sai định dạng mã tài khoản,mã có 10 chữ số");
            }
        }
        return accountCode;
    }

    public String setBankCreationDate() {
        String bankCreationDate;
        while (true) {
            System.out.println("nhập vào ngày tạo tài khoản:");
            bankCreationDate = SCANNER.nextLine();
            if (bankCreationDate.matches("(0[1-9]|[12]\\d|3[0-1])/(0[1-9]|1[0-2])/(19\\d{2}|20[01]\\d)")) {
                break;
            } else {
                System.out.println("bạn nhập sai định dạng ngày sinh,dd/mm/yyyy .dd là ngày/mm là tháng/yyyy là năm");
            }
        }
        return bankCreationDate;
    }

}
