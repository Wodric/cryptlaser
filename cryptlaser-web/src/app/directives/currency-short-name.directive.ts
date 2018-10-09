import { Directive, HostListener, ElementRef } from '@angular/core';

@Directive({
  selector: '[appCurrencyShortName]'
})
export class CurrencyShortNameDirective {
  @HostListener('input', ['$event'])
  onKeyDown(event: KeyboardEvent) {
    console.log(event);
    const input = event.target as HTMLInputElement;
    input.value = input.value.toUpperCase();
  }

  constructor (private element: ElementRef) {
    console.log(element.nativeElement);
   }
}
