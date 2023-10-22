import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu-nav',
  templateUrl: './menu-nav.component.html',
  styleUrls: ['./menu-nav.component.css']
})
export class MenuNavComponent implements OnInit {

  @Input()
  chevronDown:string = "assets/chevron-down.svg"

  constructor() { }

  ngOnInit(): void {
  }

}
