package main2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Day10 {
	public static void main(String[] args) {
		List<String> todo = new ArrayList<>();
		Scanner in = new Scanner(input);
		while(in.hasNextLine()) {
			String temp = in.nextLine();
			Stack<Character> wanted = new Stack<>();
			boolean ded = false;
			for(int i = 0; i < temp.length(); i++) {
				switch(temp.charAt(i)) {
				case '(':
					wanted.push(')');
					break;
				case '[':
					wanted.push(']');
					break;
				case '{':
					wanted.push('}');
					break;
				case '<':
					wanted.push('>');
					break;
				default:
					char x = wanted.pop();
					if(temp.charAt(i)!=x) { ded=true; }
				}
				if(ded) { break; }
				if(i==temp.length()-1) { todo.add(temp); }
			}
		}
		in.close();
		String key = " ([{<";
		String val = " )]}>";
		List<String> scores = new ArrayList<>();
		for(String line : todo) {
			Stack<Character> wanted = new Stack<>();
			for(int i = 0; i < line.length(); i++) {
				try{ wanted.push(val.charAt(key.indexOf(line.charAt(i)))); }
				catch(IndexOutOfBoundsException e) { wanted.pop(); }
			}
			String out = "";
			while(!wanted.empty()) { out+=wanted.pop(); }
			scores.add(out);
		}
		scores.sort((String s1, String s2) -> {
			long i1 = 0;
			long i2 = 0;
			for(int i = 0; i < s1.length(); i++) {
				i1*=5;
				if(val.indexOf(s1.charAt(i))==-1) { System.out.println("oof"); }
				i1+=val.indexOf(s1.charAt(i));
			}
			for(int i = 0; i < s2.length(); i++) {
				i2*=5;
				if(val.indexOf(s2.charAt(i))==-1) { System.out.println("oof"); }
				i2+=val.indexOf(s2.charAt(i));
			}
			return i1==i2?0:i1>i2?1:-1;
		});
		for(String s : scores) {
			long x = 0;
			for(int i = 0; i < s.length(); i++) {
				x*=5;
				if(val.indexOf(s.charAt(i))==-1) { System.out.println("oof"); }
				x+=val.indexOf(s.charAt(i));
			}
			System.out.println(x);
		}
		String s = scores.get((scores.size()/2));
		long x = 0;
		for(int i = 0; i < s.length(); i++) {
			x*=5;
			if(val.indexOf(s.charAt(i))==-1) { System.out.println("oof"); }
			x+=val.indexOf(s.charAt(i));
		}
		System.out.println(x);
	}
	static final String test = "[({(<(())[]>[[{[]{<()<>>\r\n" + 
			"[(()[<>])]({[<{<<[]>>(\r\n" + 
			"{([(<{}[<>[]}>{[]{[(<()>\r\n" + 
			"(((({<>}<{<{<>}{[]{[]{}\r\n" + 
			"[[<[([]))<([[{}[[()]]]\r\n" + 
			"[{[{({}]{}}([{[{{{}}([]\r\n" + 
			"{<[[]]>}<{[{[{[]{()[[[]\r\n" + 
			"[<(<(<(<{}))><([]([]()\r\n" + 
			"<{([([[(<>()){}]>(<<{{\r\n" + 
			"<{([{{}}[<[[[<>{}]]]>[]]";
	static final String input = "<[{([[<{{(<{[({}<>){{}{}}][<<>{}>[<>{}]]}(<<<>()}{[]()}>([{}()][()()]))>[({({}[])(<>())}){[({}()){[][]}]{[\r\n" + 
			"{{{{(([((<[{<<(){}>{<>}>{<(){}>{()[]}}}([{()]<{}{}>])]{<{{()[]}{[]{}}}(<[]<>>{()[]})>}>[[<{([]{}){\r\n" + 
			"[([(({<{<<<[((<><>){<>[]})]<[<[]()>[[][]]]({<>[]}<()<>>)>><<({<><>}[()[]])[[<>{}]<[][]>]>>\r\n" + 
			"<<<[{({[{([{{{()()}<<><>>}[{[]()}]}[({()<>}{()[]}){<{}<>>({}[])}]]({{{[]<>}<<>{}]}}<<([]{}){()[]}><({}\r\n" + 
			"{<({{([<<{<[[(<>{})[{}[]]]]>}<{<<{()<>}><[()()]{<>[]}>>[({[]{}}[{}{}])({()[]]{[][]})]}[{<[()()]>}{({\r\n" + 
			"[[<[[{[<[{[[<<{}<>>(()())>{{[][]}[[][]]}]][{{<<><>>[<>]}((()){[]<>})}([(<>{})<[]<>>][{[]<>}])]}{[[<{\r\n" + 
			"({{(<(([{<{<(({}[])(()[]))<{[]{}}{<>{}}>>}[<(<{}()><()<>>)[[[]()]{{}[]}]>]>{([(([][])){(<><>)[\r\n" + 
			"([{[([{[[{([(<{}<>>{()<>}){<<>><{}()>}])}({([{(){}}[[]{}]]){{{<><>}}((()<>))}}({{<<><>><(){}>}<{()()\r\n" + 
			"({([[{[{{<[[{(()()){()<>}}[[<>[]]]]<[[[]{}]]{({}[])[[]()]}>]({<{<>{}}<<>[]>><[{}{}](<><>)>}[(<{}[]><[]<>>){[\r\n" + 
			"<[([[[((({{{((()()){[]}){{<>()}[()[]]}}[<{()<>}[[]()]>]}[<{{<><>}<<><>]}{(<>())[{}[]]}>]})))](([(\r\n" + 
			"[<({<<<{[[[[([{}{}]<<>()>){<<>{}><<>[]>}][{({}[])(()())}(<<>{}>{<><>})]]{[[([]()){()<>}]{(<><>)<{}<>>}]{[{()\r\n" + 
			"{{{([{({(<[[(<()<>>)<(<>{})[<>]>]]{<{{<>{}}(<>())}<[()<>]{[][]}>><{(())[[]()]}[[[][]]([]())]>}>><([(<[()<\r\n" + 
			"[<((<<({[((<[<[][]><(){}>](({}<>)[[]{}])>([[<>[]]]{({}<>)[<>{}]}))[{{<()<>><()<>>}{(()[])({}<>)}}({{[](\r\n" + 
			"{{(<({[({({<{({}<>)([][])}>[({[]{}}{[]{}})<(<>())({}{})>]}<[[<()<>>([]{})][[[]<>](()[]}]]>)}<([{(<{}<>>)}\r\n" + 
			"{{((<{(({((({<<>[]>[<>[]]}[<[]>({}<>)])[{[<>()]([]{})}({()<>}({}[]))]){{(<()<>>([]<>))[<{}{}\r\n" + 
			"{[(<[[{<{(<{<<[]<>>(<>[])>([[]{}]{[]()})}<[[<>{}]{[][]}][(<>)[{}{}]]>>(((<()[]><()<>>)[{()<>}[()()]}){[\r\n" + 
			"((({([<{<[{[([()<>][{}<>])]}<{(<<>>([]{}))<{[]()}(<>[])>}>]{{{{{[][]}<{}{}>}({{}()}<{}{}>)}<{<<>()>([]{})\r\n" + 
			"{(<[[[[({[[<{[(){}][{}]}<<<>()>((){})>>{(<<><>>[[]{}])[<[]()><{}()>]}]{{<({})(<>{})>([{}<>](<>()\r\n" + 
			"(<({{<({<[{[((<>())<{}()>)[{[][]}[[]{}]]]}<([{{}()}[{}[]]]([<><>][{}()]))>]{<{{[<><>]}<<(){}>({}{}\r\n" + 
			"[<[[{{([{[<{[{<><>}[()[]]]}[(<<><>>)[<<>[]>{[][]}]]>((<([]{})<[]()>><(()())[<>[]]>))]}[<{{{[<>{}]}([{}[]]<\r\n" + 
			"{[(<<{<{<(<<[<<>><{}{}>][{[]}{(){}}]>>(([({}<>)<{}<>>][({}())])[[{<><>}[<>()]]<(()[])(<>{})>]\r\n" + 
			"<({[{<{{{((<{<{}<>>(()())}<[(){}>>>{<(<><>)[<><>]>([()[]](<><>))}))}}}([{{{<[{<>()}(()<>)][{<>[]}{(){}}]>[[<\r\n" + 
			"[({[<{{<<<{(<<{}<>>[<>[]]>{{<>}{()<>}}){<[<><>]><{()[]}(()[])>}}>([({{<>[]}{(){}}}[(<>[])[[][]]]){\r\n" + 
			"({(<{{{[[({{{(<>{})[[]<>]}[<[]<>>[<>{}]]}[{[<>{}]}([<>][<>[]])]}((<[[]()]<{}{}>><[{}<>]<(){}>>)({<[]{}>[{}\r\n" + 
			"<<[[<{{{[{[[<[()[]]{(){}}><{{}<>}>]<[{[]()}{{}[]}]{[<>{}]<()>}>]}[<{((<>{})){{(){}}}}(<{<>[]}{{}[]}>[{{\r\n" + 
			"[<{[[<<<<{<[[{()})<(()[])([]())>][{{{}<>}(<>{})}<<{}>(<>[])>]>}>>{{<[{{[<><>]{{}()}}}](<<(<>)({}{})><[<>()]\r\n" + 
			"(([[<[(<[[(([{{}}<[]{}>]){<((){})({}<>)>{([]())}})[<[{(){}}{[][]}]<[{}<>][(){}]>>{{{{}{}}{<><>}}}]]]([<<({(\r\n" + 
			"<<{({{<{{<[(([[]])[({}())[[]()]]){{<[]<>>[(){}]}<<<><>>({}[])>}]{{{<()<>>[[]<>]}<[()()][<>]>>[{<[]{}>[<><>\r\n" + 
			"[(<<([<{[<<{<{{}{}}({}[])><[<><>]{()[]}>><{{<>{}}([]{})}{[(){}]{<>()}}>>([(<[][]><{}>)<<()[]\r\n" + 
			"<((<<{([([<<[{()[]}{()<>}]>[[([]{})(()<>]][<()<>><[][]>]]>]{[(<(<>{})<[]()>>)[{{()}}<(<><>)(<>[])>]\r\n" + 
			"{<<[{<<[{[{{(({}{})<()<>>)}}]}<(<([{<><>}(<>())]{({}<>)})[<{[][]}[(){}]>]><<<({}()){{}()}>[[<>[]]<{}{\r\n" + 
			"{<{<({<<{{[<[[(){}]]><[([])[<>()]](<<><>><[]()>)>]<(([{}()]([]<>))<{<>{}}<[][]>>)<(<()>)>>}[[{{<()<>><{\r\n" + 
			"({[<[{[<((<{<<{}()>><{()()}{[]()}>}<[{()[]}{{}()}][((){})<<>()>]>>)({[(({}[])[()]){[[]{}]<{}()>}][{<()[]>{()\r\n" + 
			"[(<(<{[(<<<([<{}{}){<>()}]){<[<><>]({}[])>((()())[{}{}])}>[{<{[][]}{{}<>}><{()<>}[[]()]>}{{{[]\r\n" + 
			"{{{<<[{[{<(<([()[]](()[]))([[]<>]([]()))><[[[][]]{<>()}]{{<>[]}<{}()>}>)>{{{[[(){}]<{}[]>][(\r\n" + 
			"{[[[{[[<{<{{{<{}<>>[<>]}<[[]{}]{<>()}>}<{<(){}>{<>{}}}((<>[])[{}{}])>}{<<<[]()>[[]()]>{{()[]}\r\n" + 
			"([(<([<{<{(<[<()[]>[<>()}]({<>{}}<<>[]>)>([({}())[[]<>]]))[<<{<>()}>(<(){}>({}<>))>]}>}{({[[<[()\r\n" + 
			"(({(({(<<<<[[([][])(<>)][({}{})[(){}]]]>(<<<{}[]>(<>[])><(<>[])({}())>>)>[{{[{[]{}}<()<>>]{([]()){()<>}}}<[\r\n" + 
			"({<{[{[[[({[[({}[])]<([]())>][((<><>){()[]})({()[]})]}){({<[<>[]]{[]()}>((<>{})((){}))}<<<<>[]>>{{[][]}[{}\r\n" + 
			"({{{{<<{{({(<(<>{}){<>[]}>)<[[[][]]({}<>)][{[]<>}]>}(([{<>()}[<><>]](((){})[()[]]))))[<{<[[]{}]<{}<>>>(<{\r\n" + 
			"([{[(<<[{{[[{<()<>><()<>>}[<[]<>>({}())]]([(<>()){<><>}]([{}()]{<><>}})]}({<{((){}){{}[]}}>})}<[{(<[{}()]\r\n" + 
			"({(<{{[{[(<([<{}[]><{}{}>]<[{}()]{[]<>}>)<((<>())<{}<>>)<{(){}}{{}<>}>>><[[[{}<>](()<>)]<<<>{}\r\n" + 
			"{[{{((<{[(([[{()<>}[{}<>]]]{<{[]()}><<{}[]>{{}<>}>}){<{<()<>>[(){}]}[[()[]]{<>[]}]><[<<>[]]{<>}]{{\r\n" + 
			"<[({{{<{({<<<([]())[[][]]><[<>{}]<[]<>>>>{[[{}()]<{}{}>]}>})}([{(({(()())(()<>)}[[[]][{}()]])[({()<>})])}\r\n" + 
			"{{{[([<<[{{[{{[]{}}<()<>>}<({}{})<()<>>>]<({<><>}{()})(<()>({}[]))>}(<((()<>)(<>{}>)<[<><>]<<>()>>>({[{\r\n" + 
			"(<({[(<({<<[{([]{}){<>()}}{<()<>>[<>[]]}]<{[{}<>]{()[]}><{[]{}}{()()}>>>><{[[[()()][[]<>]]<[()<>][\r\n" + 
			"<<([{{{<[<{<<[()()][()]>{<{}>}><([{}{}]{{}()})>}>([(((<>()){{}{}})[([]{})<{}<>>]){((<>())<{}[]>)(<()<>\r\n" + 
			"(([[({{{({(<(<[][]>{[]{}})>)}<<{<([]{})[{}{}]>{<{}<>>}}>[<{({}[])({}())}<<()[]>>>]>)<<[<<(\r\n" + 
			"<<[[({<{[([<{<{}>{[]{}}}{<<>{}><<>[]>}><{[[]{}]<()[]>}{[<>{}]}>]<(<[(){}>[()<>]>{{()[]}<<>{}>})<<[[]<>](()())\r\n" + 
			"{([({({([[{({{(){}}([]())}<{{}{}}[{}[]]>)}[({[<>{}]<{}<>>}{{{}[]}([]{})})[<<()[]>(<><>)>{(<>()){{}{}}\r\n" + 
			"{[[{[{{<[(<([{[]{}}{[]()}]([()[]]))<{([]{})([]())}{[[]<>][{}{}]}>><[[<[]<>>[[]<>]]([{}()]([]))>[(({}{})[[][]\r\n" + 
			"[[{[<{<[{<<(([{}()](()()))([{}()]([]{})])({(<><>)}[{[]<>}([]{})])>({{<{}[]>[(){}]}<[()<>][{\r\n" + 
			"[{{<{[(<<{[(<{{}{}}[[]{}]><[[]()]>)(<<()[]>(())>)]}({(<<{}<>><[]{}>>{<()()>{[]<>}})})>((<<({{}<>}[<>{}\r\n" + 
			"{<(<{(<{{<{({<{}()>{<><>}}{(<><>)<<>[]>})<<(<>())([][])>[<{}{}>{()}]>}>[(<[<<>()><{}>][[(){}](\r\n" + 
			"({{{[((<{([{{(<>{})}[{()}[[]{}]]}<{{{}{}}{[]()}}{{(){}}}>]([(([][])(()()))]{[<[]{}>]})}}>)){(\r\n" + 
			"<([[{<{<[{({((()[])((){})){{<>{}}([]{})}})}([<([<>{}]([]))({(){}}([]<>))><[([]())(<>())}[{<>[\r\n" + 
			"[[<<{([{[[{[([[]<>]{{}()})<({}<>)[[]{}]>]{{{{}<>}{[]()}}[<[][]>{<>[]}]}}{[([<>{}][(){}])]<<[<>[]][<><>\r\n" + 
			"{({[<{<{<[{[{{{}<>}[[]()]}]{{[{}{}]([]<>)}}}](([[[()()]{()<>}]((<>[]){{}()})](((<>{})[{}[]]){{{}<\r\n" + 
			"{<<[({{[{{{{<([]{})[<>[]]><{()()}{()<>}>][<<()[]>[[]()]>[[()()][{}[]]]]}[<(<()[]><{}<>>)(({}[]\r\n" + 
			"{({((<<[{[[{{<{}[]>([])}<[[][]]>}({{[]()}{()()}}{<{}[]>[[]<>]})]{<[{[]}[()[]]]<<()()>{[][]\r\n" + 
			"<<(<((({<{{[([<><>])[[[]<>]{[]}]]}}>[{[{({{}()}{<>()})[<[]<>>[[]{}]]}<((<>()){(){}])(<<>{}>(<><>))>]}([[\r\n" + 
			"{[<<<([([[({<[[][]]>{<[]()>[[]()]}}({<[]{}>})){[<<<>()>[{}{}]><[[]<>]<()<>>>](<[{}<>]{[]<>}>[{()[]}[()()]])}\r\n" + 
			"<<[{[[<{{{[({[<><>]{{}{}}}<[()()]((){})>){<(<>{})<()<>>>[<[]{}>{()()}]})<((<<><>>){[(){}]})<{{<>[]}<[][]>\r\n" + 
			"[{({[((<(({[[[{}<>]<[]<>>][{[][]}[()[]]]][[{{}}[[]()]]<[{}<>]<{}{}>>]}{[[[<><>]<<><>>]{{[]{}}({}{})\r\n" + 
			"[<{[(<[[({<({[()[]]<()()>}<(()<>)>)>({(<[][]>[<>[]])})}<{({{()[]}<<>>}((<>[]){[]{}}))[(([]())\r\n" + 
			"(<({[{{(<{<<{{[]{}}<()<>>}<<(){}>[[]<>]>>{<(<>())<()()>>}>(<((()<>)<{}{}>)([[]<>](<>{}))><[<{}()><[]<>>]>)}\r\n" + 
			"[([[[([(<(<[<<[][]>[[]()]>[{{}{}}([]{})]]>{{[([]{})([]{})]}[[(<>)(<>{})]]}){([([()]<{}{}>)(({})(()[]))]{[{[\r\n" + 
			"({<<<<[(([{<{{<>}<{}{}>}>{{[()()}({}{})}<([]{})({}[])>}}])){({{(({()<>})[(<><>)<{}{}>])<({()<>}[()()])[{()\r\n" + 
			"([[({{{(<([<<{[][]}{{}[]}>[{{}<>}([]<>)]>[(<[]>[()()])}])(<(([{}][<><>])<{[]{}}{{}()}>)<[<{}{}>[()()]]\r\n" + 
			"<{<{((({<<<{[({}())<{}{}>]<{[]()}{[]<>}>}<<<{}()>[()<>]>{{[]<>}{[]<>}}>>>><{[[({(){}}([][]))((\r\n" + 
			"[(<<<<[({({({[()<>]<()>}([(){}]<[]{}>)}{{<<>()><()[]>}[[{}()]{{}[]}]}}{(((()))[[()[]]{[][]}])((<<><\r\n" + 
			"<<([[[{[([((([<>()][[]{}]))[({[][]})<{{}()}<()())>])])<{((<((){})>((<>())({}{})))<(([]())<{}()>){(()\r\n" + 
			"<[{{<[[{[{[<<{<>()}<<>()>>{[<>{}]{()<>}}>(<<{}{}>>{<[][]>[<><>]})]([<<<>()]<{}[]>>{<<>()>{<>{}}}]<{[<>{}](\r\n" + 
			"[<[[{({([<<(<{(){}}<()[]>}(<<>{}><<>()>))>[<{<()<>>}{({}<>)}>]><<<[{[]()}<{}{}>]{<()>}>>>])})}]<\r\n" + 
			"({<[((<([[{[{<()>([]{})}{{{}<>}[[]()]}]}{((<{}()>[<>{}])<{{}[]}>}{<{{}{}}>}}]([[{<()<>>{<><>}}<{()()}([]\r\n" + 
			"([{<<[{{(([<<{<>()}{()<>}>{[[]{}]{{}{}}}>[<[[]{}][{}[]]>[({}())<()<>>]]][{{(<><>)<{}[]>]<<{}<>>[<>\r\n" + 
			"[{[{<[<(<[({[[()[]]<[]{}>]({[]<>}(<><>))}({[[]<>>(()[])}(<<>[]>)))]>{{[{{[(){}]([]<>)}}({[()\r\n" + 
			"{{<({<<((<<[[({}[])]({()<>})][{(()<>)}{[()<>]{{}}}]>>([{{<()[]>{[]()}}[([]{})<<>()>]}[{{<>()}[{}[]]}[({}{})\r\n" + 
			"([[({<[<{<<{{<<>()><<>[]>}}>[{<({}()){{}()}>[[()[]]{()()}]}[{(<>{}}({}())}<{[]<>}<[]()>>]]>}([{{(<{}<>>\r\n" + 
			"(({{[([([<<[((()<>){{}()})<[(){}]{(){}}>]({({}())<{}()>}(<{}<>>[()[]]))>>]{[((([()()](<>)))<([<>\r\n" + 
			"{{[<<<{[{{[{[<<><>>]}[<[()[]]{{}{}}><(<>[])((){})>]][({(()[])<[]<>>}<[<><>](<>())>)])(<{{{[]<>}(()\r\n" + 
			"{([{<{(<({(({([]<>)(<><>)}{{()<>}({}[])}){[{()<>}[{}()]]<<<>{}>[<>]>})}<({{{{}{}}[()()]}(<\r\n" + 
			"(<<[{[{{[{<[[[()[]]({}<>)]<[[]()]<[]()>>]<{{<>{}}(()<>)}[([]())[[]()]]>>{<[{<><>}{<>{}}]<<[]()>(<>[])>>}}{{[\r\n" + 
			"{<{((<(((<{[[<<>()>[[]()]]{([][])[()<>]}]{({{}<>}({}{}))<{<>{}}[<>])}}>{<{{{<>{}}(<><>)}<<(){}><[]()>>}{<[\r\n" + 
			"{{{[((([([(<([()<>]{()<>})>){{{{<><>}{[]{}}}}[{({}{})(()<>)}[{{}}([]{})]]}][<({<{}{}><<>()>}[[<>()]])>([[[\r\n" + 
			"{[<<[<<{<{{[({{}{}}{[]()})<(<>())[{}()]>]<<[{}[]](()<>)>[[<>{}][{}<>]]>}(<([<><>]>(<[]>{{}[\r\n" + 
			"<<{[{<([{{<[{<[]()><[]{}>}[<<>{}>{{}{}}]]>{{<({}){[]{}}><<[]()>([]())>}{{(()<>)><[<><>][[]]>}}}}(<{((\r\n" + 
			"{(<([{{<[<{({[<>()]}[<<>[]>[[][]]])({([]<>){{}{}}}[[<><>][{}()]])}>(<[[<<>()>{{}()}>{<<>()>{[][]}}]<\r\n" + 
			"[(<{([[[{<({<{()[]}[[][]]><[{}[]]{()()}>}<[{{}[]}{()}]>)><(<<{<><>}({}())>><<({}{}>[[]()]>>)(<[{()[]}<<>()>]\r\n" + 
			"(<<{([((<[({({{}[]})<<()()><<><>>>})<{[[(){}][{}[]]][([]{})<()<>>]}([(()<>)]<{{}{}}>)>}>))<{<[(((([]())[{}[]]\r\n" + 
			"([{{<{[([[(((<[][]>){{{}[]}{()<>}})){[<[<>{}]<<><>>>]}]<({{(<>{}){<>[]]}<<<>[]>[<>[]]>}(<<{}[]>\r\n" + 
			"[{{<({<{{<({{[()]<<>[]>}[{{}{})<[]<>>]}{[[()()][{}[]]][<[][]>{<>[]}]})<{{[()[]]<()[]>}<[[][]]\r\n" + 
			"((([[((<((((<<(){}>[<>[]]>[({}[])(<>())]))[<<[{}[]]>((<>[]}{[]()})><[[{}()]<[]()>]>])([([({}<>)]<(\r\n" + 
			"[[([{[<<({[<{((){})<<>()>}{{<>[]}<{}[]>}>(((()[])[[]])<(())>)]((<<{}()>[[]()]>){<<<><>>{{}<>}>})}<<[{[";
}
