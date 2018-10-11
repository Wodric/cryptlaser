import { Directive, HostListener } from '@angular/core';

@Directive({
  selector: '[appCurrencyShortName]'
})
export class CurrencyShortNameDirective {
  @HostListener('input', ['$event'])
  onKeyDown(event: KeyboardEvent) {
    const input = event.target as HTMLInputElement;
    input.value = input.value.toUpperCase();
  }

  constructor () {
  }
}
