import { Component, HostListener, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu-bar',
  templateUrl: './menu-bar.component.html',
  styleUrls: ['./menu-bar.component.css']
})
export class MenuBarComponent implements OnInit {

  isFixed:boolean = false

  constructor() { }

  ngOnInit(): void {
  }

  @HostListener('window:scroll', ['$event'])
  onScroll(event: Event): void {
    const sonyBarElement = document.querySelector('.sony-bar') as HTMLElement;
    const menuNavElement = document.querySelector('.menu-nav__container') as HTMLElement;
    
    if (menuNavElement && sonyBarElement) {
      const menuNav = menuNavElement.offsetHeight;
      const sonyBar = sonyBarElement.offsetHeight;
      const scrollY = window.scrollY;

      if (scrollY >= menuNav + sonyBar) {
        this.isFixed = true;
      } else {
        this.isFixed = false;
      }
    }
  }

}
