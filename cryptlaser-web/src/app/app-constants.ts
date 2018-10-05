export class AppConstants {
    public static get getApiBaseURL(): string {
        return 'http://localhost:8080/api';
    }

    public static get getCurrencyType(): string[] {
        return ['PHYSICAL', 'CRYPTO', 'METAL'];
    }
}
